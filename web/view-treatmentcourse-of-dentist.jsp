<%-- 
    Document   : view-treatmentcourse-of-dentist
    Created on : Jun 15, 2023, 7:13:29 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>DentCare - Dental Clinic Website Template</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="Free HTML Templates" name="keywords">
        <meta content="Free HTML Templates" name="description">

        <!-- Favicon -->
        <link href="img/favicon.ico" rel="icon">

        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Jost:wght@500;600;700&family=Open+Sans:wght@400;600&display=swap" rel="stylesheet">

        <!-- Icon Font Stylesheet -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
        <link href="lib/animate/animate.min.css" rel="stylesheet">
        <link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />
        <link href="lib/twentytwenty/twentytwenty.css" rel="stylesheet" />

        <!-- Customized Bootstrap Stylesheet -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Template Stylesheet -->
        <link href="css/style.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/dataTables.bootstrap4.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/select2.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap-datetimepicker.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
        <link rel="stylesheet" type="text/css" href="assets/css/search-bar.css">
        <style>

        </style>
    </head>
    <body>
        <jsp:include page="headerdentist.jsp"></jsp:include>
        
        <div class="tab-pane show active" id="solid-rounded-justified-tab1">
            <div class="page-wrapper">
                <div class="content">
                    
                     <div class="row">
                        <div class="col-sm-7 col-6">
                            <h4 class="page-title">Bệnh nhân: Nguyễn Văn A</h4>
                        </div>
                        <c:set var="dentistByID" value="${requestScope.dentistByID}"></c:set>
                        <div class="col-sm-5 col-6 text-right m-b-30">
                            <a href="editDentist.jsp?dentistID=${dentistByID.id}" class="btn btn-primary btn-rounded"><i class="fa fa-plus"></i> Tạo lịch hẹn mới </a>
                        </div>
                    </div>
                        
                    <div class="row">
                        <div class="col-md-12">
                            <div class="table-responsive">
                                <table id="myTable" class="table table-border table-striped custom-table mb-0">
                                    <thead>
                                        <tr>
                                            <th style="text-align: center">Lần khám</th>
                                            <th style="text-align: center">Ngày Hẹn</th>
                                            <th style="text-align: center">Giờ Hẹn</th>
                                            <th style="text-align: center">Dịch Vụ</th>
                                            <th style="text-align: center">Trạng thái</th>
                                            <th style="text-align: center">Chỉnh sửa</th>
                                        </tr>                                        
                                    </thead>
                                    <tbody id="content">
                                       <tr style="text-align: center">
                                            <td>1</td>
                                            <td>13/6/2023</td>
                                            <td>7:30 AM</td>
                                            <td>Lấy Tuỷ</td>
                                            <td>Đã hoàn thành</td>
                                            <td></td>
                                        </tr>
                                        <tr style="text-align: center">
                                            <td>2</td>
                                            <td>14/6/2023</td>
                                            <td>9:00 AM</td>
                                            <td>Trám Răng</td>
                                            <td>Đang xử lý</td>
                                            <td><a href="view-treatmentcourse-of-dentist.jsp" class="">Chỉnh sửa</a></td>
                                        </tr>
                                        <tr style="text-align: center">
                                            <td>3</td>
                                            <td>15/6/2023</td>
                                            <td>8:30 AM</td>
                                            <td>Nhổ Răng</td>
                                            <td>Đang xử lý</td>
                                            <td><a href="view-treatmentcourse-of-dentist.jsp" class="">Chỉnh sửa</a></td>
                                        </tr>   
                                    </tbody>
                                </table>
                                <span style="color: red;">
                                    <%= (request.getAttribute("RESPONSE") == null) ? "" : (String) request.getAttribute("RESPONSE")%>
                                </span>
                            </div>
                        </div>
                    </div>
                </div>
            
            
        </div>
    </body>
</html>
