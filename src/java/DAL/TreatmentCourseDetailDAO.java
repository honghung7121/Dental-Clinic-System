/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Models.TreatmentCourse;
import Models.TreatmentCourseDetail;
import Util.Util;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class TreatmentCourseDetailDAO {

    public static ArrayList<TreatmentCourseDetail> getAllTreatmentDetail() {
        ArrayList<TreatmentCourseDetail> list = new ArrayList<>();
        Util dbu = new Util();

        String sql = "select td.id, nameTreatment, treatmentDate,treatmentTime, serviceName, td.description,td.status, statusPaid, statusFeedBack\n"
                + "from tblTreatmentCourse tc\n"
                + "JOIN tblTreatmentCourseDetail td on tc.id = td.treatmentID\n"
                + "JOIN tblService ON td.serviceID = tblService.id";
        try {
            Connection connection = dbu.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nameTreatment = rs.getString("nameTreatment");
                String treatmentdate = rs.getString("treatmentDate");
                String treatmenttime = rs.getString("treatmentTime");
                String servicename = rs.getString("serviceName");
                String description = rs.getString("description");
                boolean status = rs.getBoolean("status");
                boolean statuspaid = rs.getBoolean("statusPaid");
                boolean statusFeedBack = rs.getBoolean("statusFeedBack");
                TreatmentCourseDetail c = new TreatmentCourseDetail(id, nameTreatment, treatmentdate, treatmenttime, servicename, description, status, statuspaid, statusFeedBack);
                list.add(c);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public static ArrayList<TreatmentCourseDetail> getTreatmentDetailByUserID(String from, String paid) {
        ArrayList<TreatmentCourseDetail> list = new ArrayList<>();
        Util dbu = new Util();

        String sql = "select td.id, nameTreatment, treatmentDate,treatmentTime, serviceName, td.description,td.status, statusPaid, statusFeedBack\n"
                + "from tblTreatmentCourse tc\n"
                + "JOIN tblTreatmentCourseDetail td on tc.id = td.treatmentID\n"
                + "JOIN tblService ON td.serviceID = tblService.id\n"
                + "where tc.userID = ? and td.statusPaid = ?\n"
                + "ORDER BY td.status DESC, treatmentDate ASC, treatmentTime ASC";
        try {
            Connection connection = dbu.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, from);
            ps.setString(2, paid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nameTreatment = rs.getString("nameTreatment");
                String treatmentdate = rs.getString("treatmentDate");
                String treatmenttime = rs.getString("treatmentTime");
                String servicename = rs.getString("serviceName");
                String description = rs.getString("description");
                boolean status = rs.getBoolean("status");
                boolean statuspaid = rs.getBoolean("statusPaid");
                boolean statusFeedBack = rs.getBoolean("statusFeedBack");
                TreatmentCourseDetail c = new TreatmentCourseDetail(id, nameTreatment, treatmentdate, treatmenttime, servicename, description, status, statuspaid, statusFeedBack);
                list.add(c);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public static ArrayList<TreatmentCourseDetail> getInvoicesDetailByTreatmentID(String from) {
        ArrayList<TreatmentCourseDetail> list = new ArrayList<>();
        Util dbu = new Util();

        String sql = "SELECT tblTreatmentCourseDetail.id AS id, tblService.serviceName AS serviceName,tblTreatmentCourseDetail.description,tblTreatmentCourseDetail.status,tblTreatmentCourseDetail.statusPaid, tblService.price AS price\n"
                + "FROM tblTreatmentCourseDetail, tblService, tblTreatmentCourse\n"
                + "WHERE tblTreatmentCourseDetail.treatmentID = tblTreatmentCourse.id\n"
                + "AND tblTreatmentCourseDetail.serviceID = tblService.id\n"
                + "AND tblTreatmentCourseDetail.treatmentID = ? ORDER BY tblTreatmentCourseDetail.status DESC";
        try {
            Connection connection = dbu.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, from);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String servicename = rs.getString("serviceName");
                String description = rs.getString("description");
                boolean status = rs.getBoolean("status");
                boolean statuspaid = rs.getBoolean("statusPaid");
                float price = rs.getFloat("price");
                TreatmentCourseDetail c = new TreatmentCourseDetail(id, servicename, description, status, statuspaid, price);
                list.add(c);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public static boolean invoicesConfirm(String treatmentID) {
        boolean kq = false;
        Connection cn = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "UPDATE dbo.tblTreatmentCourseDetail\n"
                        + "SET statusPaid = 'true'\n"
                        + "WHERE treatmentID = ?\n";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, treatmentID);

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

    public static boolean invoicesUpdate(String treatmentID) {

        boolean kq = false;
        Connection cn = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "UPDATE dbo.tblTreatmentCourse\n"
                        + "SET status = 'true'\n"
                        + "WHERE id = ?";
                PreparedStatement pst = cn.prepareStatement(sql);

                pst.setString(1, treatmentID);

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

    public static boolean invoicesCheck(String treatmentID) {

        boolean check = true;

        Connection cn = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "SELECT status\n"
                        + "    FROM dbo.tblTreatmentCourseDetail\n"
                        + "    WHERE tblTreatmentCourseDetail.status = 'false' and treatmentID = ?";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, treatmentID);

                ResultSet rs = pst.executeQuery();
                if (rs != null && rs.next()) {
                    check = rs.getBoolean("status");
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

        return check;
    }

    public static boolean treatmentCheck(String treatmentID) {
        boolean check = true; // Assume 'false' by default

        Connection cn = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "SELECT statusPaid\n"
                        + "FROM dbo.tblTreatmentCourseDetail\n"
                        + "WHERE tblTreatmentCourseDetail.statusPaid = 'false' AND treatmentID = ?";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, treatmentID);

                ResultSet rs = pst.executeQuery();
                if (rs != null && rs.next()) {
                    check = rs.getBoolean("statusPaid");
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
        return check;
    }

    public static String getMailPatientByTreatmentID(String idTreatment) {
        Connection cn = null;
        String mailPatient = "";
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "SELECT email\n"
                        + "                        FROM tblTreatmentCourseDetail td, tblTreatmentCourse t, tblUser u\n"
                        + "                        WHERE td.treatmentID = t.id AND t.userID = u.id AND td.treatmentID = ?";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, idTreatment);
                ResultSet rs = pst.executeQuery();
                if (rs != null && rs.next()) {
                    mailPatient = rs.getString("email");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mailPatient;
    }

    public static ArrayList<TreatmentCourseDetail> getTreatmentDetailByTreatmentID(String from) {
        ArrayList<TreatmentCourseDetail> list = new ArrayList<>();
        Util dbu = new Util();

        String sql = "SELECT treatmentDate,tblTreatmentCourseDetail.id AS id, tblService.serviceName AS serviceName,tblTreatmentCourseDetail.description,tblTreatmentCourseDetail.status,tblTreatmentCourseDetail.statusPaid, treatmentTime\n"
                + "FROM tblTreatmentCourseDetail, tblService, tblTreatmentCourse\n"
                + "WHERE tblTreatmentCourseDetail.treatmentID = tblTreatmentCourse.id\n"
                + "AND tblTreatmentCourseDetail.serviceID = tblService.id\n"
                + "AND tblTreatmentCourseDetail.treatmentID = ? ORDER BY tblTreatmentCourseDetail.status DESC, treatmentDate ASC";
        try {
            Connection connection = dbu.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, from);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String treatmentdate = rs.getString("treatmentDate");
                String treatmenttime = rs.getString("treatmentTime");
                String servicename = rs.getString("serviceName");
                String description = rs.getString("description");
                boolean status = rs.getBoolean("status");
                boolean statuspaid = rs.getBoolean("statusPaid");
                TreatmentCourseDetail c = new TreatmentCourseDetail(id, treatmentdate, treatmenttime, servicename, description, status, statuspaid);
                list.add(c);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public static TreatmentCourseDetail getTreatmentDetailByID(String idDetail) {
        Connection cn = null;
        TreatmentCourseDetail c = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "SELECT tblTreatmentCourseDetail.id AS id, treatmentDate, treatmentTime, tblService.serviceName AS serviceName,tblTreatmentCourseDetail.description,tblTreatmentCourseDetail.status,tblTreatmentCourseDetail.statusPaid\n"
                        + "FROM tblTreatmentCourseDetail, tblService, tblTreatmentCourse\n"
                        + "WHERE tblTreatmentCourseDetail.treatmentID = tblTreatmentCourse.id\n"
                        + "AND tblTreatmentCourseDetail.serviceID = tblService.id\n"
                        + "AND tblTreatmentCourseDetail.id = ?\n";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, idDetail);
                ResultSet rs = pst.executeQuery();
                if (rs != null && rs.next()) {
                    int id = rs.getInt("id");
                    String treatmentdate = rs.getString("treatmentDate");
                    String treatmenttime = rs.getString("treatmentTime");
                    String servicename = rs.getString("serviceName");
                    String description = rs.getString("description");
                    boolean status = rs.getBoolean("status");
                    boolean statuspaid = rs.getBoolean("statusPaid");
                    c = new TreatmentCourseDetail(id, treatmentdate, treatmenttime, servicename, description, status, statuspaid);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }

    public static boolean updateTreatmentDetail(String id, String date, String time, String serviceID, String description, String status, String statusPaid) {
        boolean kq = false;
        Connection cn = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "UPDATE dbo.tblTreatmentCourseDetail\n"
                        + "SET treatmentDate = ?,\n"
                        + "    treatmentTime = ?,\n"
                        + "    serviceID = ?,\n"
                        + "    description = ?,\n"
                        + "    status = ?,\n"
                        + "    statusPaid = ?\n"
                        + "WHERE id = ?";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, date);
                pst.setString(2, time);
                pst.setString(3, serviceID);
                pst.setString(4, description);
                pst.setString(5, status);
                pst.setString(6, statusPaid);
                pst.setString(7, id);

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

    public static boolean insertTreatmentDetail(String treatmentID, String date, String time, String serviceID, String description, String status, String statusPaid) {
        boolean kq = false;
        Connection cn = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "INSERT INTO dbo.tblTreatmentCourseDetail\n"
                        + "           (treatmentDate\n"
                        + "           ,treatmentID\n"
                        + "           ,serviceID\n"
                        + "           ,description\n"
                        + "           ,status\n"
                        + "           ,statusPaid\n"
                        + "           ,treatmentTime\n"
                        + "           ,statusFeedback)\n"
                        + "     VALUES(?,?,?,?,?,?,?,?)";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, date);
                pst.setString(2, treatmentID);
                pst.setString(3, serviceID);
                pst.setString(4, description);
                pst.setString(5, status);
                pst.setString(6, statusPaid);
                pst.setString(7, time);
                pst.setString(8, "0");

                int rs = pst.executeUpdate();
                cn.close();
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

    public static int getIDPatientByTreatmentID(String idTreatment) throws SQLException {
        Connection cn = null;
        int idPatient = 0;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "SELECT u.id AS id\n"
                        + "FROM tblTreatmentCourseDetail td, tblTreatmentCourse t, tblUser u\n"
                        + "WHERE td.treatmentID = t.id AND t.userID = u.id AND td.treatmentID = ?";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, idTreatment);
                ResultSet rs = pst.executeQuery();
                if (rs != null && rs.next()) {
                    idPatient = rs.getInt("id");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                cn.close();
            }
        }
        return idPatient;
    }

    public static void UpdateStatusFeedBack(int id) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = Util.getConnection();
            if (con != null) {
                String sql = "update tblTreatmentCourseDetail set statusFeedBack = 1 where id = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, id);
                stm.execute();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    public static int getDentistIDByTreatmentCourseID(int id) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = Util.getConnection();
            if (con != null) {
                String sql = "select t.dentistID from\n"
                        + "tblTreatmentCourse t join tblTreatmentCourseDetail td \n"
                        + "on t.id = td.treatmentID\n"
                        + "where td.id = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, id);
                rs = stm.executeQuery();
                if (rs.next()) {
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

    public static void changeTimeTreatmentCourse(int id, Date date, Time time) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = Util.getConnection();
            if (con != null) {
                String sql = "update tblTreatmentCourseDetail set treatmentDate = ?, treatmentTime = ? where id =?";
                stm = con.prepareStatement(sql);
                stm.setDate(1, date);
                stm.setTime(2, time);
                stm.setInt(3, id);
                stm.executeUpdate();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    public static boolean checkDuplicateDateTreatmentDetailOfDentist(int idDentist, String date, String time) {
        Connection cn = null;
        TreatmentCourseDetail c = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "SELECT td.id AS id, treatmentDate, treatmentTime, tblService.serviceName AS serviceName,td.description,td.status,td.statusPaid\n"
                        + "FROM tblTreatmentCourse tc\n"
                        + "JOIN tblTreatmentCourseDetail td on tc.id = td.treatmentID\n"
                        + "JOIN tblService ON td.serviceID = tblService.id\n"
                        + "WHERE tc.dentistID = ? AND td.treatmentDate = ? AND td.treatmentTime = ?\n"
                        + "ORDER BY td.status DESC, treatmentDate ASC, treatmentTime ASC";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setInt(1, idDentist);
                pst.setString(2, date);
                pst.setString(3, time);

                ResultSet rs = pst.executeQuery();
                if (rs != null && rs.next()) {
                    return true;
                }
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

    //true --> Đã hoàn thành 1 liệu trình hoàn chỉnh
    public static boolean checkCompleteTreatment(String idTreatment) {
        Connection cn = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "SELECT td.id AS id, treatmentDate, treatmentTime, tblService.serviceName AS serviceName,td.description,td.status,td.statusPaid\n"
                        + "FROM tblTreatmentCourse tc\n"
                        + "JOIN tblTreatmentCourseDetail td on tc.id = td.treatmentID\n"
                        + "JOIN tblService ON td.serviceID = tblService.id\n"
                        + "WHERE td.treatmentID = ? AND (td.status = 'false' OR td.statusPaid = 'false')\n"
                        + "ORDER BY td.status DESC, treatmentDate ASC, treatmentTime ASC";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, idTreatment);

                ResultSet rs = pst.executeQuery();
                if (rs != null && rs.next()) {
                    return false;
                } else {
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

    public static boolean deleteTreatmentDetalWhereStatusFalse(String idDetail) {

        boolean kq = false;
        Connection cn = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "DELETE FROM tblTreatmentCourseDetail\n"
                        + "WHERE id = ? AND status = '0' AND statusPaid = '0'";
                PreparedStatement pst = cn.prepareStatement(sql);

                pst.setString(1, idDetail);

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
