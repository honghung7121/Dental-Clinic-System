<%-- 
    Document   : add-treatmentcoursedetail
    Created on : Jun 16, 2023, 7:50:33 PM
    Author     : ADMIN
--%>

<%@page import="DAL.ServiceDAO"%>
<%@page import="Models.Service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAL.TreatmentCourseDetailDAO"%>
<%@page import="Models.TreatmentCourseDetail"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">


    <!-- edit-doctor24:06-->
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
        <link rel="shortcut icon" type="image/x-icon" href="assets/img/logo.png">
        <title>DentCare</title>
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/select2.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap-datetimepicker.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
        <!--[if lt IE 9]>
                    <script src="assets/js/html5shiv.min.js"></script>
                    <script src="assets/js/respond.min.js"></script>
            <![endif]-->
    </head>

    <body>
        <c:if test="${sessionScope.User.getRoleID() != 2}"><c:redirect url="login.jsp"/></c:if>
            <div class="main-wrapper">

            <jsp:include page="headerdentist.jsp"></jsp:include>
                <div class="page-wrapper">
                    <div class="content">
                        <div class="row">
                            <div class="col-lg-8 offset-lg-2">
                                <h3 class="page-title">Tạo ngày hẹn tái khám mới</h3>
                            </div>
                        </div>

                    <%
                        String idDetail =(String) request.getParameter("idDetail");
                        TreatmentCourseDetail treatmentdetail = TreatmentCourseDetailDAO.getTreatmentDetailByID(idDetail);
                        ArrayList<Service> listService = ServiceDAO.getAllService();
                    %>
                    <div class="row">
                        <div class="col-lg-8 offset-lg-2">
                            <form action="MainController" method="get">     
                                <div class="row">
                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <strong><label>Ngày Hẹn<span class="text-danger">*</span></label></strong>
                                            <input class="form-control" type="date" name="editDateDetail" required="" id="editDateInput">
                                        </div>
                                    </div>

                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <strong><label>Giờ Hẹn <span class="text-danger">*</span></label></strong>
                                            <select class="form-control" name="editTimeDetail" required="">
                                                <option value="" disabled>-- Chọn giờ --</option>
                                                <%
                                                for(int i = 8; i < 22; i++){    
                                                    if(i<10){
                                                %>
                                                        <option value="<%= "0" + i + ":00" %>">0<%= i%>:00:00</option>
                                                        <option value="<%= "0" + i + ":30" %>">0<%= i%>:30:00</option>
                                                <%    
                                                    } else{
                                                %>
                                                        <option value="<%= i+":00" %>"><%= i%>:00:00</option>
                                                        <option value="<%= i+":30" %>"><%= i%>:30:00</option>
                                                <%
                                                    }
                                                }
                                                %>
                                            </select>
                                        </div>
                                    </div>
                                            
                                    <h5 style="color: red"> ${"    "}  ${requestScope.reportDuplicate}</h5>     
                                    
                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <strong><label>Dịch Vụ</label></strong>
                                            <select class="form-control" name="editServiceDetail" required>
                                                <option value="" disabled selected>-- Chọn dịch vụ --</option>
                                                <%
                                                 for (Service ser : listService) {
                                                %>
                                                    <option value="<%= ser.getId() %>"><%= ser.getName() %></option>
                                                <%
                                                }
                                                %>
                                            </select>
                                        </div>
                                    </div>
                                        
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <strong><label>Ghi Chú</label></strong>
                                            <textarea class="form-control" rows="3" cols="30" name="editDescriptionDetail" placeholder="Tình trạng bệnh nhân ..."></textarea>
                                        </div>
                                    </div>

                                    <div class="col-sm-12">
                                        <div class="m-t-20 text-center">
                                            <button class="btn btn-primary submit-btn" name="action" value="addDetail">Cập Nhật</button>
                                        </div>
                                    </div>    
                                </div>
                            </form>
                        </div>
                    </div>

                </div>

            </div>
        </div> 
        <script>
            // Hàm để lấy ngày hiện tại dưới dạng chuỗi 'YYYY-MM-DD'
            function getCurrentDate() {
                const today = new Date();
                const year = today.getFullYear();
                const month = String(today.getMonth() + 1).padStart(2, '0');
                const day = String(today.getDate()).padStart(2, '0');
                return `${year}-${month}-${day}`;
            }
            // Lấy phần tử input và đặt giá trị tối thiểu bằng ngày hiện tại
            const editDateInput = document.getElementById('editDateInput');
            editDateInput.min = getCurrentDate();
        </script>                     
    </body>
</html>