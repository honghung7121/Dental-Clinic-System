/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Util.Util;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class UserDAO {
    public User checkLogin(String accountName, String password) throws SQLException{
        User user = null;
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try{
            con = Util.getConnection();
            if(con!=null){
                String sql1 = "select * from tblUser where email = ? and password = ?";
                stm = con.prepareStatement(sql1);
                stm.setString(1, accountName);
                stm.setString(2, password);
                rs = stm.executeQuery();
                if(rs.next()){
                    user = new User(rs.getInt(1), rs.getString(2), "*********", rs.getInt(4), rs.getInt(5), rs.getBoolean(6), rs.getString(7), rs.getString(8));
                }
                else {
                    String sql2 = "select * from tblUser where phoneNumber = ? and password = ?";
                    stm = con.prepareStatement(sql2);
                    stm.setInt(1, Integer.parseInt(accountName));
                    stm.setString(2, password);
                    rs = stm.executeQuery();
                    if(rs.next()){
                        user = new User(rs.getInt(1), rs.getString(2), "*********", rs.getInt(4), rs.getInt(5), rs.getBoolean(6), rs.getString(7), rs.getString(8));
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(rs!=null){
                rs.close();
            }
            if(stm!=null){
                rs.close();
            }
            if(con!=null){
                con.close();
            }
        }
        return user;
    }

        public static ArrayList<User> getAllPatient() {
        ArrayList<User> list = new ArrayList<>();
        Connection cn = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "select *\n"
                        + "from tblUser \n"
                        + "where idRole = 5";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs != null) {
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String fullName = rs.getString("fullName");
                        String password = rs.getString("password");
                        int phoneNumber = rs.getInt("phoneNumber");
                        int idRole = rs.getInt("idRole");
                        boolean status = rs.getBoolean("status");
                        String email = rs.getString("email");  
                        String roll = rs.getString("Roll");
                        User patient = new User(id, fullName, password, phoneNumber, idRole, status, email, roll);
                        list.add(patient);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
        
            }
         public static ArrayList<User> searchPatient(String search) {
             
        ArrayList<User> list = new ArrayList<>();
        Connection cn = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql ="select *\n" +
"                         from tblUser \n" +
"                        where fullName like '?%'";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, search);
                ResultSet rs = pst.executeQuery();
                if (rs != null) {
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String fullName = rs.getString("fullName");
                        String password = rs.getString("password");
                        int phoneNumber = rs.getInt("phoneNumber");
                        int idRole = rs.getInt("idRole");
                        boolean status = rs.getBoolean("status");
                        String email = rs.getString("email");             
                        User patient = new User(id, fullName, password, phoneNumber, idRole, status, email, sql);
                        list.add(patient);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
        
            }
        
        public static void main(String[] args) {
            UserDAO DAO = new UserDAO();
            List<User> list = DAO.getAllPatient();
            for (User p : list) {
                System.out.println(p);
            }
    }
    }
