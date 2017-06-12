package homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PersonDAOImpl implements PersonDAO {
    Connection conn=ConnectionFactory.getConnection();
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    public void insert(PersonVO person) {
        try {
            pstmt = conn.prepareStatement("INSERT INTO persons(id,name,phone,kkt,sns) VALUES(NULL,?,?,?,?)");
            //pstmt.setString(1, person.getId());
            pstmt.setString(1, person.getName());
            pstmt.setString(2, person.getPhone());
            pstmt.setString(3, person.getKKT());
            pstmt.setString(4, person.getSNS());
            System.out.println("* inserting..."+person.getId()+person.getName()+person.getPhone()+person.getKKT()+person.getSNS());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public PersonVO findById(int id) {
        PersonVO person=null;
        try {
            pstmt = conn.prepareStatement("SELECT * FROM persons WHERE id=?");
            pstmt.setInt(1, id);
            System.out.println("* finding by id..."+id);
            rs = pstmt.executeQuery();
            if(rs.next()) {
                person = new PersonVO();
                person.setId(rs.getInt("id"));
                person.setName(rs.getString("name"));
                person.setPhone(rs.getString("phone"));
                person.setKKT(rs.getString("kkt"));
                person.setSNS(rs.getString("sns"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return person;
    }
    public List<PersonVO> findAll() {
        Statement stmt=null;
        List<PersonVO> persons = new ArrayList<PersonVO>();
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM persons");
            PersonVO person = null;
            while(rs.next()){
                person = new PersonVO();
                //person.setId(Integer.parseInt(rs.getString("id")));
                person.setId(rs.getInt("id"));
                person.setName(rs.getString("name"));
                person.setPhone(rs.getString("phone"));
                person.setKKT(rs.getString("kkt"));
                person.setSNS(rs.getString("sns"));
                persons.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(stmt != null) stmt.close();
            } catch (Exception e) {};
 }
        System.out.println("* finding all..."+persons);
        return persons;
    }
    public void update(PersonVO person) {
        try {
            pstmt = conn.prepareStatement("UPDATE persons SET name=?,phone=?,kkt=?,sns=? WHERE id=?"); 
            pstmt.setString(1, person.getName());
            pstmt.setString(2, person.getPhone());
            pstmt.setString(3, person.getKKT());
            pstmt.setString(4, person.getSNS());
            pstmt.setInt(5, person.getId());
            System.out.println("* updating..."+person.getName());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void delete(int id) {
        try {
            pstmt = conn.prepareStatement("DELETE FROM persons WHERE id=?");
            pstmt.setInt(1, id);
            int rows=pstmt.executeUpdate();
     if (rows == 0) {  
  System.out.println("!can not delete..."+id+" does not exist!");
     } else if (rows > 0) {  
  System.out.println("* deleting..."+id);
     } 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void close() {
        System.out.println("* closing all...");
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (Exception e) {
     e.printStackTrace();
 }
    }
}