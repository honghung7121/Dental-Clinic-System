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
                    user = new User(rs.getInt(1), rs.getString(2), "*********", rs.getInt(4), rs.getInt(5), rs.getBoolean(6), rs.getString(7), rs.getString(8), rs.getString(9));
                } else {
                    String sql2 = "select * from tblUser where phoneNumber = ? and password = ?";
                    stm = con.prepareStatement(sql2);
                    stm.setInt(1, Integer.parseInt(accountName));
                    stm.setString(2, password);
                    rs = stm.executeQuery();
                    if (rs.next()) {
                        user = new User(rs.getInt(1), rs.getString(2), "*********", rs.getInt(4), rs.getInt(5), rs.getBoolean(6), rs.getString(7), rs.getString(8), rs.getString(9));
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
                stm.close();
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
                String sql = "select count(*) from tblUser where idRole !=5 and idRole!=2";
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
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return 0;
    }

    public int getAllNumberPatient() throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = Util.getConnection();
            if (con != null) {
                String sql = "select count(*) from tblUser where idRole =5";
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
                stm.close();
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
                String sql = "select * from tblUser where idRole !=5 and idRole !=2 and status = 1  order by id desc offset ? rows fetch next 8 rows only";
                stm = con.prepareStatement(sql);
                stm.setInt(1, (index - 1) * 8);
                rs = stm.executeQuery();
                while (rs.next()) {
                    list.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getBoolean(6), rs.getString(7), rs.getString(8), rs.getString(9)));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return list;
    }

    public List<User> searchEmployeesByRole(int id) throws SQLException {
        List<User> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = Util.getConnection();
            if (con != null) {
                if (id != 0) {
                    String sql = "select * from tblUser where idRole = ?";
                    stm = con.prepareStatement(sql);
                    stm.setInt(1, id);
                } else {
                    list = pagingEmployees(1);
                }
                rs = stm.executeQuery();
                while (rs.next()) {
                    list.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getBoolean(6), rs.getString(7), rs.getString(8), rs.getString(9)));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return list;
    }

    public List<User> searchEmployeesByName(String name) throws SQLException {
        List<User> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = Util.getConnection();
            if (con != null) {
                String sql = "select * from tblUser where fullName like ? and idRole!=5 and idRole!=2 and status = 1";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + name + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    list.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getBoolean(6), rs.getString(7), rs.getString(8), rs.getString(9)));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return list;
    }

    public User getEmployeeById(int id) throws SQLException {
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
                    user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getBoolean(6), rs.getString(7), rs.getString(8), rs.getString(9));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return user;
    }

    public void editEmployee(int id, String name, String email, int phoneNumber, int roleID, boolean status, String gender) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = Util.getConnection();
            if (con != null) {
                String sql = "update tblUser set fullName = ?, phoneNumber = ?, idRole = ?, status =?, gender = ?, email = ? where id = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, name);
                stm.setInt(2, phoneNumber);
                stm.setInt(3, roleID);
                stm.setBoolean(4, status);
                stm.setString(5, gender);
                stm.setString(6, email);
                stm.setInt(7, id);
                stm.executeUpdate();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    public void insertEmployee(String name, String password, int phoneNumber, int idRole, String gender, String email) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = Util.getConnection();
            if (con != null) {
                String sql = "insert into tblUser(fullName, password, phoneNumber, idRole,status, email, gender) values(?,?,?,?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setString(1, name);
                stm.setString(2, password);
                stm.setInt(3, phoneNumber);
                stm.setInt(4, idRole);
                stm.setBoolean(5, true);
                stm.setString(6, email);
                stm.setString(7, gender);
                stm.executeUpdate();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    public static ArrayList<User> getAllPatient() {
        ArrayList<User> list = new ArrayList<>();
        Connection cn = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "select *\n"
                        + "from tblUser\n"
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
                        String gender = rs.getString("gender");
                        User patient = new User(id, fullName, password, phoneNumber, idRole, status, email, roll, gender);
                        list.add(patient);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }
        public void deleteEmployeeByID(int id) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = Util.getConnection();
            if (con != null) {
                String sql = "update tblUser set status = 0 where id = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, id);
                stm.executeUpdate();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    public static ArrayList<User> searchPatient(String searchname) {
        ArrayList<User> list = new ArrayList<>();
        Connection cn = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "select * from tblUser\n"
                        + "where [fullName] like ? and idRole = 5";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, "%" + searchname + "%");
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

    public static boolean insertPatient(String fullName, String email, int phoneNumber, int status, int idRole, String Roll, String password, String gender) {
        Connection cn = null;
        int kq = 0;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String s = "insert into dbo.tblUser(fullName, email,phoneNumber,status,idRole,Roll,password,gender)\n"
                        + "                        values (?,?,?,?,5,?,?,?)";
                PreparedStatement pst = cn.prepareStatement(s);
                pst.setString(1, fullName);
                pst.setString(2, email);
                pst.setInt(3, phoneNumber);
                pst.setInt(4, status);
                pst.setString(5, Roll);
                pst.setString(6, password);
                pst.setString(7, gender);
                kq = pst.executeUpdate();
                if (kq != 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    public static User getPatient(int id) {
        Connection cn = null;
        User p = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "select * from  tblUser where id = ?";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery();
                if (rs != null && rs.next()) {
                    String name = rs.getString("fullName");
                    String password = rs.getString("password");
                    int phoneNumber = rs.getInt("phoneNumber");
                    int idRole = rs.getInt("idRole");

                    boolean status = rs.getBoolean("status");
                    String email = rs.getString("email");
                    String Roll = rs.getString("Roll");
                    p = new User(id, name, password, phoneNumber, idRole, status, email, Roll);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return p;
    }

    public static boolean editPatient(String fullName, String email, String password, int phoneNumber, String Roll, boolean status) {
        Connection cn = null;
        int kq = 0;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "update dbo.tblUser\n"
                        + "set fullName=?,email=?,password=?,phoneNumber=?,Roll=?,status=?\n"
                        + " where id = ?";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, fullName);
                pst.setString(2, email);
                pst.setString(3, password);
                pst.setInt(4, phoneNumber);
                pst.setString(5, Roll);
                pst.setBoolean(6, status);
                kq = pst.executeUpdate();
                if (kq != 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

       public ArrayList<User> getCountPatient(int from) {
        ArrayList<User> list = new ArrayList<>();
        Util dbu = new Util();

        String sql = " select *\n"
                + "from tblUser where idRole =5 and status =1\n"
                + "order by id DESC\n"
                + "offset ? row\n"
                + "fetch next 7 row only";
        try {
            Connection connection = dbu.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, from);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User c = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getBoolean(6), rs.getString(7), rs.getString(8));
                list.add(c);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
       public static boolean deletePatient(String id, int status) {
        boolean kq = false;
        User den = null;
        Connection cn = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "UPDATE tblUser\n"
                        + "SET status = ?\n"
                        + "WHERE id = ?;\n";

                PreparedStatement pst = cn.prepareStatement(sql);

                pst.setInt(1, status);

                pst.setString(2, id);

                int rs = pst.executeUpdate();
                kq = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return kq;
    }

    public boolean checkEmailExists(String email) {
        Connection cn = null;
        int kq = 0;
        boolean emailExists = false;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "select * from  tblUser where email = ?";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, email);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    int count = rs.getInt(1);
                    emailExists = (count > 0);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return emailExists;
    }

    public boolean checkRollExists(String roll) {
        Connection cn = null;
        int kq = 0;
        boolean rollExists = false;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "select * from  tblUser where Roll = ?";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, roll);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    int count = rs.getInt(1);
                    rollExists = (count > 0);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rollExists;
    }
    public void editMyProfile(int id, String name, int phoneNumer, String gender) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = Util.getConnection();
            if (con != null) {
                String sql = "update tblUser set fullName = ?, phoneNumber = ?, gender = ? where id = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, name);
                stm.setInt(2, phoneNumer);
                stm.setString(3, gender);
                stm.setInt(4, id);
                stm.executeUpdate();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
    } 
}
