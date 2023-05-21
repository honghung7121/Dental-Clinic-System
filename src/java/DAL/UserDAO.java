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

    public User checkLogin(String accountName, String password) throws SQLException {
        User user = null;
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = Util.getConnection();
            if (con != null) {
                String sql1 = "select * from tblUser where email = ? and password = ?";
                stm = con.prepareStatement(sql1);
                stm.setString(1, accountName);
                stm.setString(2, password);
                rs = stm.executeQuery();
                if (rs.next()) {
                    user = new User(rs.getInt(1), rs.getString(2), "*********", rs.getInt(4), rs.getInt(5), rs.getBoolean(6), rs.getString(7), rs.getString(8));
                } else {
                    String sql2 = "select * from tblUser where phoneNumber = ? and password = ?";
                    stm = con.prepareStatement(sql2);
                    stm.setInt(1, Integer.parseInt(accountName));
                    stm.setString(2, password);
                    rs = stm.executeQuery();
                    if (rs.next()) {
                        user = new User(rs.getInt(1), rs.getString(2), "*********", rs.getInt(4), rs.getInt(5), rs.getBoolean(6), rs.getString(7), rs.getString(8));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                rs.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return user;
    }

    public int getAllEmployees() throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = Util.getConnection();
            if (con != null) {
                String sql = "select count(*) from tblUser where idRole !=5";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    return rs.getInt(1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                rs.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return 0;
    }

    public List<User> pagingEmployees(int index) throws SQLException {
        List<User> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = Util.getConnection();
            if (con != null) {
                String sql = "select * from tblUser where idRole !=5 order by id offset ? rows fetch next 8 rows only";
                stm = con.prepareStatement(sql);
                stm.setInt(1, (index-1)*8);
                rs = stm.executeQuery();
                while (rs.next()) {                    
                    list.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getBoolean(6), rs.getString(7), rs.getString(8)));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                rs.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return list;
    }
    public List<User> searchEmployeesByRole(int id) throws SQLException{
        List<User> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = Util.getConnection();
            if (con != null) {
                String sql = "select * from tblUser where idRole = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, id);
                rs = stm.executeQuery();
                while (rs.next()) {                    
                    list.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getBoolean(6), rs.getString(7), rs.getString(8)));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                rs.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return list;
    }
    public List<User> searchEmployeesByName(String name) throws SQLException{
        List<User> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = Util.getConnection();
            if (con != null) {
                String sql = "select * from tblUser where fullName like ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%"+name+"%");
                rs = stm.executeQuery();
                while (rs.next()) {                    
                    list.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getBoolean(6), rs.getString(7), rs.getString(8)));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                rs.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return list;
    }
    public User getEmployeeById(int id) throws SQLException{
        User user = null;
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = Util.getConnection();
            if (con != null) {
                String sql = "select * from tblUser where id = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, id);
                rs = stm.executeQuery();
                while (rs.next()) {                    
                    user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getBoolean(6), rs.getString(7), rs.getString(8));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                rs.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return user;
    }
}
