/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Models.Dentist;
import Util.Util;

/**
 *
 * @author ADMIN
 */
public class DentistDAO {

    public static ArrayList<Dentist> getAllDentist() {
        Connection cn = null;
        ArrayList<Dentist> list = new ArrayList<>();
        Dentist den = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "select id, fullName, phoneNumber, password, email, idRole, Roll, gender, degree, experience, image, status\n"
                        + "from tblUser u, tblDentist d\n"
                        + "where u.id = d.dentistID and status = 1";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs != null) {
                    while (rs.next()) {
                        int idden = rs.getInt("id");
                        String fullnameden = rs.getString("fullName");
                        int phoneden = rs.getInt("phoneNumber");
                        String passwordden = rs.getString("password");
                        String emailden = rs.getString("email");
                        int idRoleden = rs.getInt("idRole");
                        String Rollden = rs.getString("Roll");
                        String genderden = rs.getString("gender");
                        String degreeden = rs.getString("degree");
                        String experienceden = rs.getString("experience");
                        String imgden = rs.getString("image");
                        boolean statusden = rs.getBoolean("status");
 
                        den = new Dentist(degreeden, experienceden, imgden, idden, fullnameden, passwordden, phoneden, idRoleden, statusden, emailden, Rollden, genderden);
                        list.add(den);
                    }
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
        return list;
    }

    public ArrayList<Dentist> getTop8Dentist() {
        Connection cn = null;
        ArrayList<Dentist> list = new ArrayList<>();
        Dentist den = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "select top 8 * from tblUser u, tblDentist d\n"
                        + "where u.id = d.dentistID and status = 1";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs != null) {
                    while (rs.next()) {
                       int idden = rs.getInt("id");
                        String fullnameden = rs.getString("fullName");
                        int phoneden = rs.getInt("phoneNumber");
                        String passwordden = rs.getString("password");
                        String emailden = rs.getString("email");
                        int idRoleden = rs.getInt("idRole");
                        String Rollden = rs.getString("Roll");
                        String genderden = rs.getString("gender");
                        String degreeden = rs.getString("degree");
                        String experienceden = rs.getString("experience");
                        String imgden = rs.getString("image");
                        boolean statusden = rs.getBoolean("status");
 
                        den = new Dentist(degreeden, experienceden, imgden, idden, fullnameden, passwordden, phoneden, idRoleden, statusden, emailden, Rollden, genderden);
                        list.add(den);
                    }
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
        return list;
    }

    public ArrayList<Dentist> getNext4Dentist(int amount) {
        Connection cn = null;
        ArrayList<Dentist> list = new ArrayList<>();
        Dentist den = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "select * from tblUser u, tblDentist d\n"
                        + "where u.id = d.dentistID and status = 1\n"
                        + "order by id offset ? rows\n"
                        + "fetch next 4 rows only";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setInt(1, amount);
                ResultSet rs = pst.executeQuery();
                if (rs != null) {
                    while (rs.next()) {
                       int idden = rs.getInt("id");
                        String fullnameden = rs.getString("fullName");
                        int phoneden = rs.getInt("phoneNumber");
                        String passwordden = rs.getString("password");
                        String emailden = rs.getString("email");
                        int idRoleden = rs.getInt("idRole");
                        String Rollden = rs.getString("Roll");
                        String genderden = rs.getString("gender");
                        String degreeden = rs.getString("degree");
                        String experienceden = rs.getString("experience");
                        String imgden = rs.getString("image");
                        boolean statusden = rs.getBoolean("status");
 
                        den = new Dentist(degreeden, experienceden, imgden, idden, fullnameden, passwordden, phoneden, idRoleden, statusden, emailden, Rollden, genderden);
                        list.add(den);
                    }
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
        return list;
    }
    
    public ArrayList<Dentist> getNext3Dentist(int amount) {
        Connection cn = null;
        ArrayList<Dentist> list = new ArrayList<>();
        Dentist den = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "select * from tblUser u, tblDentist d\n"
                        + "where u.id = d.dentistID and status = 1\n"
                        + "order by id offset ? rows\n"
                        + "fetch next 3 rows only";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setInt(1, amount);
                ResultSet rs = pst.executeQuery();
                if (rs != null) {
                    while (rs.next()) {
                       int idden = rs.getInt("id");
                        String fullnameden = rs.getString("fullName");
                        int phoneden = rs.getInt("phoneNumber");
                        String passwordden = rs.getString("password");
                        String emailden = rs.getString("email");
                        int idRoleden = rs.getInt("idRole");
                        String Rollden = rs.getString("Roll");
                        String genderden = rs.getString("gender");
                        String degreeden = rs.getString("degree");
                        String experienceden = rs.getString("experience");
                        String imgden = rs.getString("image");
                        boolean statusden = rs.getBoolean("status");
 
                        den = new Dentist(degreeden, experienceden, imgden, idden, fullnameden, passwordden, phoneden, idRoleden, statusden, emailden, Rollden, genderden);
                        list.add(den);
                    }
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
        return list;
    }

    public static Dentist getDentistByID(String id) {
        Connection cn = null;
        Dentist den = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "select id, fullName, phoneNumber, password, email, idRole, Roll, gender, degree, experience, image, status\n"
                        + "from tblUser, tblDentist\n"
                        + "where id = dentistID AND id = ?";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(id));

                ResultSet rs = pst.executeQuery();
                if (rs != null && rs.next()) {
                   int idden = rs.getInt("id");
                    String fullnameden = rs.getString("fullName");
                    int phoneden = rs.getInt("phoneNumber");
                    String passwordden = rs.getString("password");
                    String emailden = rs.getString("email");
                    int idRoleden = rs.getInt("idRole");
                    String Rollden = rs.getString("Roll");
                    String genderden = rs.getString("gender");
                    String degreeden = rs.getString("degree");
                    String experienceden = rs.getString("experience");
                    String imgden = rs.getString("image");
                    boolean statusden = rs.getBoolean("status");

                    den = new Dentist(degreeden, experienceden, imgden, idden, fullnameden, passwordden, phoneden, idRoleden, statusden, emailden, Rollden, genderden);
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
        return den;
    }

    public static boolean updateDentist(int id, String fullname, int phone, String email, String degree, String experience, String img, int status, String gender) {
        boolean kq = false;
        Dentist den = null;
        Connection cn = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "UPDATE tblUser\n"
                        + "SET fullName = ?, phoneNumber = ?, email = ?, status = ?, gender = ?\n"
                        + "WHERE id = ?;\n"
                        + "\n"
                        + "UPDATE tblDentist\n"
                        + "SET experience = ?, degree = ?, image = ?\n"
                        + "WHERE dentistID = ?;";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, fullname);
                pst.setInt(2, phone);
                pst.setString(3, email);
                pst.setInt(4, status);
                pst.setString(5, gender);
                pst.setInt(6, id);
                pst.setString(7, experience);
                pst.setString(8, degree);
                pst.setString(9, img);
                pst.setInt(10, id);

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

    public static boolean insertDentist(String fullname, int phone, String email, String password, String degree, String experience, String img, int status, String gender) {
        Connection cn = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                int iddentist = 0;

                String sql = "INSERT INTO tblUser\n"
                        + "values (?,?,?,?,?,?,?,?)\n";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, fullname);
                pst.setString(2, password);
                pst.setInt(3, phone);
                pst.setInt(4, 2);
                pst.setInt(5, 1);
                pst.setString(6, email);
                pst.setString(7, null);
                pst.setString(8, gender);
                pst.executeUpdate();

                sql = "select top 1 id from tblUser order by id desc";
                pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs != null && rs.next()) {
                    iddentist = rs.getInt("id");
                }
                System.out.println("iddentist: " + iddentist);

                sql = "INSERT INTO tblDentist\n"
                        + "values (?, ?, ?, ?)";
                pst = cn.prepareStatement(sql);
                pst.setInt(1, iddentist);
                pst.setString(2, experience);
                pst.setString(3, degree);
                pst.setString(4, img);
                pst.executeUpdate();

                cn.close();
                return true;
            } else {
                return false;
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

    public static boolean updateStatusDentist(int id, int status) {
        boolean kq = false;
        Dentist den = null;
        Connection cn = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "UPDATE tblUser\n"
                        + "SET status = ?\n"
                        + "WHERE id = ?;\n";

                PreparedStatement pst = cn.prepareStatement(sql);

                pst.setInt(1, status);

                pst.setInt(2, id);

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

}
