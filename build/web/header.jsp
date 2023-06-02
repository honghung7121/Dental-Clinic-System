<%-- 
    Document   : header
    Created on : May 22, 2023, 1:56:36 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
        <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
        <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
        <!--[if lt IE 9]>
                    <script src="assets/js/html5shiv.min.js"></script>
                    <script src="assets/js/respond.min.js"></script>
            <![endif]-->
    <div class="sidebar-overlay" data-reff=""></div>
    <script src="assets/js/jquery-3.2.1.min.js"></script>
    <script src="assets/js/popper.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/jquery.slimscroll.js"></script>
    <script src="assets/js/Chart.bundle.js"></script>
    <script src="assets/js/chart.js"></script>
    <script src="assets/js/app.js"></script>
</head>
<body>

    <div class="header">
        <div class="header-left">
            <a href="index-2.html" class="logo">
                <img src="assets/img/logo.png" width="35" height="35" alt=""> <span>DentCare</span>
            </a>
        </div>
        <a id="toggle_btn" href="javascript:void(0);"><i class="fa fa-bars"></i></a>
        <a id="mobile_btn" class="mobile_btn float-left" href="#sidebar"><i class="fa fa-bars"></i></a>
        <ul class="nav user-menu float-right">


            <li class="nav-item dropdown has-arrow">
                <a href="#" class="dropdown-toggle nav-link user-link" data-toggle="dropdown">
                    <span class="user-img">
                        <img class="rounded-circle" src="assets/img/user.jpg" width="24" alt="Admin">
                        <span class="status online"></span>
                    </span>
                    <span>Admin</span>
                </a>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="myprofile.jsp">Tài Khoản Của Tôi</a>
                    <a class="dropdown-item" href="MainController?action=Logout">Đăng Xuất</a>
                </div>
            </li>
        </ul>
    </div>
    <div class="sidebar" id="sidebar">
        <div class="sidebar-inner slimscroll">
            <div id="sidebar-menu" class="sidebar-menu">

                <c:set var="activeLink" value="${sessionScope.activeLink}"></c:set>
                <c:set var="option" value="${sessionScope.option}"></c:set>

                <c:set var="dashboardLink" value="dashboardLink"></c:set>
                <c:set var="dentistLink" value="dentistLink"></c:set>
                <c:set var="patientLink" value="patientLink"></c:set>
                <c:set var="serviceLink" value="serviceLink"></c:set>
                <c:set var="employeeLink" value="employeeLink"></c:set>
                <c:set var="dsnv" value="dsnv"></c:set>
                <c:set var="feedbackLink" value="feedbackLink"></c:set>
                <c:set var="feedbackDentistLink" value="feedbackDentistLink"></c:set>
                <c:set var="feedbackServiceLink" value="feedbackServiceLink"></c:set>

                <c:if test="${activeLink eq dashboardLink}">
                    <c:set var="dashboardLink" value="active"></c:set>
                </c:if>
                <c:if test="${activeLink eq dentistLink}">
                    <c:set var="dentistLink" value="active"></c:set>
                </c:if>
                <c:if test="${activeLink eq patientLink}">
                    <c:set var="patientLink" value="active"></c:set>
                </c:if>
                <c:if test="${activeLink eq serviceLink}">
                    <c:set var="serviceLink" value="active"></c:set>
                </c:if>

                <c:if test="${activeLink eq employeeLink}">
                    <c:set var="employeeLink" value="active"></c:set>
                    <c:if test="${option eq dsnv}">
                        <c:set var="employeeLink2" value="#888888"></c:set>
                        <c:set var="employeeLink3" value="#888888"></c:set>
                    </c:if>
                </c:if>

                <c:if test="${activeLink eq feedbackLink}">
                    <c:set var="feedbackLink" value="active"></c:set>
                    <c:if test="${option eq feedbackDentistLink}">
                        <c:set var="feedbackServiceLink" value="#888888"></c:set>
                    </c:if>
                    <c:if test="${option eq feedbackServiceLink}">
                        <c:set var="feedbackDentistLink" value="#888888"></c:set>
                    </c:if>
                </c:if>

                <ul>        
                    <li class="menu-title">Main</li>
                    <li class="${dashboardLink}">
                        <a href="DashBoardController"><i class="fa fa-dashboard"></i> <span>Dashboard</span></a>
                    </li>
                    <li class="${dentistLink}">
                        <a href="MainController?action=dentist"><i class="fa fa-user-md"></i> <span>Bác Sĩ</span></a>
                    </li>
                    <li class="${patientLink}">
                        <a href="MainController?action=patient"><i class="fa fa-wheelchair"></i> <span>Bệnh Nhân</span></a>
                    </li>
                    <!--                    <li>
                                            <a href="appointments.html"><i class="fa fa-calendar"></i> <span>Cuộc Hẹn</span></a>
                                        </li>
                                        <li>
                                            <a href="schedule.html"><i class="fa fa-calendar-check-o"></i> <span>Lịch Bác Sĩ</span></a>
                                        </li>-->
                    <li class="${serviceLink}">
                        <a href="MainController?action=Service"><i class="fa fa-cube"></i> <span>Dịch Vụ</span></a>
                    </li>

                    <li class="submenu ${employeeLink}">
                        <a href="#"><i class="fa fa-user"></i> <span> Nhân Viên </span> <span class="menu-arrow"></span></a>
                        <ul style="display: none;">
                            <li>
                                <!--                                                                <form action="MainController" method="POST">
                                                                                                    <button type="submit">Danh Sách Nhân Viên</button>
                                                                                                    <input type="hidden" name="action" value="GetEmployees">
                                                                                                    <input type="hidden" name="index" value="1">
                                                                                                    <input type="hidden" name="click" value="1">
                                                                                                </form>-->
                                <a href="MainController?action=GetEmployees&index=1&click=1" style="color: ${employeeLink1}">Danh Sách Nhân Viên</a>
                            </li>
                        </ul>
                    </li>
                    <li class="submenu">
                        <a href="#"><i class="fa fa-money"></i> <span> Tài Khoản </span> <span class="menu-arrow"></span></a>
                        <ul style="display: none;">
                            <li><a href="invoices.html">Hoá Đơn</a></li>
                            <li><a href="payments.html">Thanh Toán</a></li>
                        </ul>
                    </li>
                    <li class="submenu ${feedbackLink}">
                        <a href="#"><i class="fa fa-comment"></i> <span> Phản hồi </span> <span class="menu-arrow"></span></a>
                        <ul style="display: none;">
                            <li><a href="MainController?action=View Feedback Dentist" onclick="event.stopPropagation();" style="color: ${feedbackDentistLink}">Nha sĩ</a></li>
                            <li><a href="MainController?action=View Feedback Service" style="color: ${feedbackServiceLink}">Dịch vụ</a></li>
                        </ul>
                    </li> 
                    <li>
                        <a href="settings.html"><i class="fa fa-cog"></i> <span>Cài Đặt</span></a>
                    </li>                        
                </ul>
            </div>
        </div>
    </div>

</body>
</html>
