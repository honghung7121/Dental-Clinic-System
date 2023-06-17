<%-- 
    Document   : serviceUser
    Created on : Jun 8, 2023, 7:53:27 PM
    Author     : Admin
--%>

<%@page import="DAL.ServiceDAO"%>
<%@page import="Models.Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@page import="java.util.Date"%>

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

        <link
            href="https://fonts.googleapis.com/css2?family=Be+Vietnam+Pro:wght@100;300;400;500;800&family=Poppins:wght@400;500;600;700&display=swap"
            rel="stylesheet">


        <link href="https://fonts.googleapis.com/css2?family=Be+Vietnam+Pro:wght@100;300;400;500;800&family=Poppins:wght@400;500;600;700&display=swap" rel="stylesheet">

        <!-- Icon Font Stylesheet -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
        <link href="lib/animate/animate.min.css" rel="stylesheet">
        <link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />
        <link href="lib/twentytwenty/twentytwenty.css" rel="stylesheet" />

        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/dataTables.bootstrap4.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/select2.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap-datetimepicker.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">

        <!-- Customized Bootstrap Stylesheet -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Template Stylesheet -->
        <link href="css/style.css" rel="stylesheet">
        <style>      
            .btnLink{
                background: none;
                border: none;
                cursor: pointer;
                color: #009ce7;
                font-weight: bold;
            }
        </style>
    </head>
    <body>
        <%
            Date dNow = new Date();
            SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd");
        %>
        <jsp:include page="headerUser.jsp"></jsp:include>
        <c:set var="u" value="${sessionScope.User}"></c:set>
            <div class="modal fade" id="searchModal" tabindex="-1">
                <div class="modal-dialog modal-fullscreen">
                    <div class="modal-content" style="background: rgba(9, 30, 62, .7);">
                        <div class="modal-header border-0">
                            <button type="button" class="btn bg-white btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body d-flex align-items-center justify-content-center">
                            <div class="input-group" style="max-width: 600px;">
                                <input type="text" class="form-control bg-transparent border-primary p-3" placeholder="Type search keyword">
                                <button class="btn btn-primary px-4"><i class="bi bi-search"></i></button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container-fluid bg-primary py-5 hero-header mb-5">
                <div class="row py-3">
                    <div class="col-12 text-center">
                        <h1 class="display-3 text-white animated zoomIn">Tài Khoản</h1>
                        <a href="" class="h4 text-white">Trang chủ</a>
                        <i class="far fa-circle text-white px-2"></i>
                        <a href="" class="h4 text-white">Thông Tin</a>
                    </div>
                </div>
            </div>
            <div class="container-fluid py-5 wow fadeInUp" data-wow-delay="0.1s">
                <div class="container">
                    <div class="row g-5 mb-5">
                        <div class="col-lg-12">
                            <div class="section-title mb-5">
                                <h5 class="position-relative d-inline-block text-primary text-uppercase">Thông Tin Của Tôi</h5>
                            </div>

                            <div class="card-box profile-header">
                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="profile-view">
                                            <div class="profile-img-wrap">
                                                <div class="profile-img">
                                                    <a href="#"><img class="avatar" src="" alt=""></a>
                                                </div>
                                            </div>
                                            <div class="profile-basic">
                                                <div class="row">
                                                    <div class="col-md-5">
                                                        <div class="profile-info-left">
                                                            <h3 class="user-name m-t-0 mb-0">${u.getFullName()}</h3>
                                                        <div class="staff-id">ID Nhân Sự: ${u.getId()}</div>
                                                        <div class="staff-id">Mã Bệnh Nhân : ${u.getRoll()}</div>

                                                        <div class="staff-msg"><a href="changePasswordUser.jsp" class="btn btn-primary btn-rounded">Thay đổi mật khẩu</a></div>

                                                    </div>
                                                </div>
                                                <div class="col-md-7">
                                                    <ul class="personal-info">
                                                        <li>
                                                            <span class="title">Số Điện Thoại:</span>
                                                            <span class="text"><a href="#">${u.getPhoneNumber()}</a></span>
                                                        </li>
                                                        <li>
                                                            <span class="title">Email:</span>
                                                            <span class="text"><a href="#">${u.getEmail()}</a></span>
                                                        </li>
                                                        <li>
                                                            <span class="title">Giới tính:</span>
                                                            <span class="text">${u.getGender()}</span>
                                                        </li>
                                                        <li>
                                                            <span class="title">Vai Trò:</span>
                                                            <c:choose>
                                                                <c:when test = "${u.getRoleID() ==  1}" ><span class="text">Admin</span></c:when>
                                                                <c:when test = "${u.getRoleID() ==  3}" ><span class="text">Marketing</span></c:when>
                                                                <c:when test = "${u.getRoleID() ==  5}" ><span class="text">User</span></c:when>
                                                                <c:otherwise><span class="text">Chăm Sóc Khách Hàng</span></c:otherwise>
                                                            </c:choose>
                                                        </li>
                                                    </ul>
                                                </div>
                                            </div>
                                        </div>
                                    </div>                        
                                </div>
                            </div>
                        </div>
                        <div class="profile-tabs">
                            <div class="card-box">

                                <ul class="nav nav-tabs nav-tabs-solid nav-tabs-rounded nav-justified">
                                    <li class="nav-item"><a class="nav-link active" href="#solid-rounded-justified-tab1" data-toggle="tab">Liệu Trình</a></li>
                                    <li class="nav-item"><a class="nav-link" href="#solid-rounded-justified-tab2" data-toggle="tab">Lịch Hẹn</a></li>
                                    <!--                                    <li class="nav-item"><a class="nav-link" href="#solid-rounded-justified-tab3" data-toggle="tab">Hoá Đơn</a></li>-->
                                </ul>
                                <div class="tab-content">
                                    <div class="tab-pane show active" id="solid-rounded-justified-tab1">
                                        <div class="row">
                                            <div class="col-md-12">
                                                <div class="card-box">
                                                    <div class="card-block">

                                                        <div class="table-responsive">
                                                            <table id="myTable" class="table table-hover mb-0">
                                                                <thead>
                                                                    <tr>
                                                                        <th style="text-align: center">ID</th>
                                                                        <th style="text-align: center">Tên Bệnh Nhân</th>
                                                                        <th style="text-align: center">Tên Bác Sĩ</th>
                                                                        <th style="text-align: center">Tên Liệu Trình</th>
                                                                        <th style="text-align: center">Trạng Thái</th>
                                                                    </tr>
                                                                </thead>
                                                                <tbody>
                                                                    <c:forEach var="s" items="${requestScope.TreatmentList}">
                                                                        <tr style="text-align: center">
                                                                            <td><c:out value="${s.getId()}"></c:out></td>
                                                                            <td><c:out value="${s.getNamecustomer()}"></c:out></td>
                                                                            <td><c:out value="${s.getNamedentist()}"></c:out></td>
                                                                            <td><c:out value="${s.getNameTreatment()}"></c:out></td>
                                                                            <c:if test="${s.isStatus()==true}">
                                                                                <td><span style="width: 100px;
                                                                                          height: 40px;line-height: 35px;" class="custom-badge status-green">Hoàn Thành</span></td>
                                                                                </c:if>
                                                                                <c:if test="${s.isStatus()==false}">
                                                                                <td><span style="width: 100px;
                                                                                          height: 40px;line-height: 35px;" class="custom-badge status-orange">Đang Điều Trị</span></td>
                                                                                </c:if>
                                                                        </tr>
                                                                    </c:forEach>
                                                                </tbody>
                                                            </table>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="tab-pane" id="solid-rounded-justified-tab2">
                                        <div class="row">
                                            <div class="col-md-12">
                                                <div class="card-box">
                                                    <div class="card-block">

                                                        <div class="table-responsive">
                                                            <table id="myTable" class="table table-hover mb-0">
                                                                <thead>
                                                                    <tr>
                                                                        <th style="text-align: center">Tên Liệu Trình</th>
                                                                        <th style="text-align: center">Ngày Tái Khám</th>
                                                                        <th style="text-align: center">Giờ Hẹn</th>
                                                                        <th style="text-align: center">Dịch Vụ</th>
                                                                        <th style="text-align: center">Mô Tả</th>
                                                                        <th style="text-align: center">Trạng Thái</th>
                                                                        <th style="text-align: center">Thanh Toán</th>
                                                                    </tr>
                                                                </thead>
                                                                <tbody id="content">
                                                                    <c:forEach var="d" items="${requestScope.TreatmentDetailList}">
                                                                        <tr style="text-align: center">
                                                                            <td><c:out value="${d.getNameTreatment()}"></c:out></td>
                                                                            <td><c:out value="${d.getTreatmentdate()}"></c:out></td>
                                                                            <td><c:out value="${d.getTreatmenttime()}"></c:out></td>
                                                                            <td><c:out value="${d.getNameService()}"></c:out></td>
                                                                            <td><c:out value="${d.getDescription()}"></c:out></td>
                                                                            <c:if test="${d.isStatus()==true}">
                                                                                <td style=""><span style="width: 100px;
                                                                                                   height: 40px;line-height: 35px;" class="custom-badge status-green">Hoàn Thành</span></td>
                                                                                </c:if>
                                                                                <c:if test="${d.isStatus()==false}">
                                                                                <td><span style="width: 100px;
                                                                                          height: 40px;line-height: 35px;" class="custom-badge status-orange">Đang Điều Trị</span></td>
                                                                                </c:if>
                                                                                <c:if test="${d.isStatusPaid()==true}">
                                                                                <td><span style="width: 100px;
                                                                                          height: 40px;" class="custom-badge status-green"> Đã Thanh Toán</span></td>
                                                                                </c:if>
                                                                                <c:if test="${d.isStatusPaid()==false}">
                                                                                <td><span style="width: 100px;
                                                                                          height: 40px;" class="custom-badge status-orange">Chưa Thanh Toán</span></td>
                                                                                </c:if>
                                                                        </tr>
                                                                    </c:forEach>
                                                                </tbody>               
                                                            </table>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="tab-pane" id="solid-rounded-justified-tab3">
                                        <div class="row">
                                            <div class="col-md-12">
                                                <div class="card-box">
                                                    <div class="card-block">

                                                        <div class="table-responsive">
                                                            <table id="myTable" class="table table-hover mb-0">
                                                                <thead>
                                                                    <tr>
                                                                        <th style="text-align: center">ID</th>
                                                                        <th style="text-align: center">Tên Dịch Vụ</th>
                                                                        <th style="text-align: center">Số Tiền</th>
                                                                        <th style="text-align: center">Giao Dịch</th>
                                                                    </tr>
                                                                </thead>
                                                                <tbody>
                                                                    <tr style="text-align: center">
                                                                        <td>1</td>
                                                                        <td>Lấy Tuỷ</td>
                                                                        <td>200.000đ</td>
                                                                        <td><a href="invoiceView.jsp" class="btn btn-primary btn-rounded">Thanh Toán</a></td>
                                                                    </tr>
                                                                    <tr style="text-align: center">
                                                                        <td>2</td>
                                                                        <td>Khám Tổng Quát</td>
                                                                        <td>100.000đ</td>
                                                                        <td><a href="#" class="btn btn-primary btn-rounded">Thanh Toán</a></td>
                                                                    </tr>
                                                                    <tr style="text-align: center">
                                                                        <td>2</td>
                                                                        <td>Trám Răng</td>
                                                                        <td>250.000đ</td>
                                                                        <td><a href="#" class="btn btn-primary btn-rounded">Thanh Toán</a></td>
                                                                    </tr>
                                                                </tbody>
                                                            </table>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>



        <!-- Newsletter Start -->
        <div class="container-fluid position-relative pt-5 wow fadeInUp" data-wow-delay="0.1s" style="z-index: 1;">
            <div class="container">
                <div class="bg-primary p-5">
                    <form class="mx-auto" style="max-width: 600px;">
                        <div class="input-group">
                            <input type="text" class="form-control border-white p-3" placeholder="Email của bạn">
                            <button class="btn btn-dark px-4">Đăng ký</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- Newsletter End -->


        <jsp:include page="footer.jsp"></jsp:include>


        <!-- Back to Top -->
        <a href="#" class="btn btn-lg btn-primary btn-lg-square rounded back-to-top"><i class="bi bi-arrow-up"></i></a>


        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
        <script src="lib/wow/wow.min.js"></script>
        <script src="lib/easing/easing.min.js"></script>
        <script src="lib/waypoints/waypoints.min.js"></script>
        <script src="lib/owlcarousel/owl.carousel.min.js"></script>
        <script src="lib/tempusdominus/js/moment.min.js"></script>
        <script src="lib/tempusdominus/js/moment-timezone.min.js"></script>
        <script src="lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>
        <script src="lib/twentytwenty/jquery.event.move.js"></script>
        <script src="lib/twentytwenty/jquery.twentytwenty.js"></script>

        <!-- Template Javascript -->


        <script src="assets/js/popper.min.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.slimscroll.js"></script>
        <script src="assets/js/Chart.bundle.js"></script>
        <script src="assets/js/chart.js"></script>
        <script src="assets/js/app.js"></script>

        <script src="assets/js/title_sort.js"></script>                        

        <script src="assets/js/jquery.dataTables.min.js"></script>
        <script src="assets/js/dataTables.bootstrap4.min.js"></script>

        <script src="assets/js/select2.min.js"></script>
        <script src="assets/js/moment.min.js"></script>
        <script src="assets/js/bootstrap-datetimepicker.min.js"></script>
        <script src="js/main.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
        <script>
            function searchByName(text) {
                $.ajax({
                    url: '/SWP391-SE1743/MainController',
                    data: {
                        action: 'Search Service User By Name',
                        name: text.value
                    },
                    success: function (data) {
                        let row = document.getElementById("content");
                        row.innerHTML = data;
                    },
                    error: function (error) {
                        console("Fail");
                    },
                    type: 'GET'
                });
            }

        </script>

    </body>
</html>
