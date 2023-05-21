<%-- 
    Document   : employee
    Created on : May 20, 2023, 6:22:43 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">


    <!-- employees23:21-->
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
        <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
        <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/dataTables.bootstrap4.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/select2.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap-datetimepicker.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
        <!--[if lt IE 9]>
                    <script src="assets/js/html5shiv.min.js"></script>
                    <script src="assets/js/respond.min.js"></script>
            <![endif]-->
    </head>

    <body>
        <div class="main-wrapper">
            <div class="header">
                <div class="header-left">
                    <a href="index-2.html" class="logo">
                        <img src="assets/img/logo.png" width="35" height="35" alt=""> <span>DentCare</span>
                    </a>
                </div>
                <a id="toggle_btn" href="javascript:void(0);"><i class="fa fa-bars"></i></a>
                <a id="mobile_btn" class="mobile_btn float-left" href="#sidebar"><i class="fa fa-bars"></i></a>
                <ul class="nav user-menu float-right">
                    <li class="nav-item dropdown d-none d-sm-block">
                        <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown"><i class="fa fa-bell-o"></i> <span class="badge badge-pill bg-danger float-right">3</span></a>
                        <div class="dropdown-menu notifications">
                            <div class="topnav-dropdown-header">
                                <span>Notifications</span>
                            </div>
                            <div class="drop-scroll">
                                <ul class="notification-list">
                                    <li class="notification-message">
                                        <a href="activities.html">
                                            <div class="media">
                                                <span class="avatar">
                                                    <img alt="John Doe" src="assets/img/user.jpg" class="img-fluid">
                                                </span>
                                                <div class="media-body">
                                                    <p class="noti-details"><span class="noti-title">John Doe</span> added new task <span class="noti-title">Patient appointment booking</span></p>
                                                    <p class="noti-time"><span class="notification-time">4 mins ago</span></p>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="notification-message">
                                        <a href="activities.html">
                                            <div class="media">
                                                <span class="avatar">V</span>
                                                <div class="media-body">
                                                    <p class="noti-details"><span class="noti-title">Tarah Shropshire</span> changed the task name <span class="noti-title">Appointment booking with payment gateway</span></p>
                                                    <p class="noti-time"><span class="notification-time">6 mins ago</span></p>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="notification-message">
                                        <a href="activities.html">
                                            <div class="media">
                                                <span class="avatar">L</span>
                                                <div class="media-body">
                                                    <p class="noti-details"><span class="noti-title">Misty Tison</span> added <span class="noti-title">Domenic Houston</span> and <span class="noti-title">Claire Mapes</span> to project <span class="noti-title">Doctor available module</span></p>
                                                    <p class="noti-time"><span class="notification-time">8 mins ago</span></p>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="notification-message">
                                        <a href="activities.html">
                                            <div class="media">
                                                <span class="avatar">G</span>
                                                <div class="media-body">
                                                    <p class="noti-details"><span class="noti-title">Rolland Webber</span> completed task <span class="noti-title">Patient and Doctor video conferencing</span></p>
                                                    <p class="noti-time"><span class="notification-time">12 mins ago</span></p>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="notification-message">
                                        <a href="activities.html">
                                            <div class="media">
                                                <span class="avatar">V</span>
                                                <div class="media-body">
                                                    <p class="noti-details"><span class="noti-title">Bernardo Galaviz</span> added new task <span class="noti-title">Private chat module</span></p>
                                                    <p class="noti-time"><span class="notification-time">2 days ago</span></p>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                </ul>
                            </div>
                            <div class="topnav-dropdown-footer">
                                <a href="activities.html">View all Notifications</a>
                            </div>
                        </div>
                    </li>
                    <li class="nav-item dropdown d-none d-sm-block">
                        <a href="javascript:void(0);" id="open_msg_box" class="hasnotifications nav-link"><i class="fa fa-comment-o"></i> <span class="badge badge-pill bg-danger float-right">8</span></a>
                    </li>
                    <li class="nav-item dropdown has-arrow">
                        <a href="#" class="dropdown-toggle nav-link user-link" data-toggle="dropdown">
                            <span class="user-img"><img class="rounded-circle" src="assets/img/user.jpg" width="40" alt="Admin">
                                <span class="status online"></span></span>
                            <span>Admin</span>
                        </a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="profile.html">My Profile</a>
                            <a class="dropdown-item" href="edit-profile.html">Edit Profile</a>
                            <a class="dropdown-item" href="settings.html">Settings</a>
                            <a class="dropdown-item" href="login.html">Logout</a>
                        </div>
                    </li>
                </ul>
                <div class="dropdown mobile-user-menu float-right">
                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-ellipsis-v"></i></a>
                    <div class="dropdown-menu dropdown-menu-right">
                        <a class="dropdown-item" href="profile.html">My Profile</a>
                        <a class="dropdown-item" href="edit-profile.html">Edit Profile</a>
                        <a class="dropdown-item" href="settings.html">Settings</a>
                        <a class="dropdown-item" href="login.html">Logout</a>
                    </div>
                </div>
            </div>
            <div class="sidebar" id="sidebar">
                <div class="sidebar-inner slimscroll">
                    <div id="sidebar-menu" class="sidebar-menu">
                        <ul>
                            <li class="menu-title">Main</li>
                            <li >
                                <a href="index-2.html"><i class="fa fa-dashboard"></i> <span>Dashboard</span></a>
                            </li>
                            <li>
                                <a href="doctors.html"><i class="fa fa-user-md"></i> <span>Bác Sĩ</span></a>
                            </li>
                            <li>
                                <a href="patients.html"><i class="fa fa-wheelchair"></i> <span>Bệnh Nhân</span></a>
                            </li>
                            <li>
                                <a href="appointments.html"><i class="fa fa-calendar"></i> <span>Cuộc Hẹn</span></a>
                            </li>
                            <li>
                                <a href="schedule.html"><i class="fa fa-calendar-check-o"></i> <span>Lịch Bác Sĩ</span></a>
                            </li>
                            <li class="submenu">
                                <a href="#"><i class="fa fa-user"></i> <span> Nhân Viên </span> <span class="menu-arrow"></span></a>
                                <ul style="display: none;">
                                    <li><a class="active" href="MainController?action=GetAllEmployees">Danh Sách Nhân Viên</a></li>
                                    <li><a href="holidays.html">Ngày Nghỉ</a></li>
                                    <li><a href="attendance.html">Điểm Danh</a></li>
                                </ul>
                            </li>
                            <li class="submenu">
                                <a href="#"><i class="fa fa-money"></i> <span> Tài Khoản </span> <span class="menu-arrow"></span></a>
                                <ul style="display: none;">
                                    <li><a href="invoices.html">Invoices</a></li>
                                    <li><a href="payments.html">Payments</a></li>
                                    <li><a href="expenses.html">Expenses</a></li>
                                    <li><a href="taxes.html">Taxes</a></li>
                                    <li><a href="provident-fund.html">Provident Fund</a></li>
                                </ul>
                            </li>

                            <li>
                                <a href="settings.html"><i class="fa fa-cog"></i> <span>Cài Đặt</span></a>
                            </li>

                        </ul>
                    </div>
                </div>
            </div>
            <div class="page-wrapper">
                <div class="content">
                    <div class="row">
                        <div class="col-sm-4 col-3">
                            <h4 class="page-title">Quản Lý Nhân Viên</h4>
                        </div>
                        <div class="col-sm-8 col-9 text-right m-b-20">
                            <a href="add-employee.html" class="btn btn-primary float-right btn-rounded"><i class="fa fa-plus"></i> Thêm Nhân Viên</a>
                        </div>
                    </div>
                    <div class="row filter-row">
                        <div class="col-sm-6 col-md-3">
                            <div class="form-group form-focus">
                                <label class="focus-label">Tên Nhân Viên</label>
                                <input oninput="searchByName(this)" type="text" class="form-control floating">
                            </div>
                        </div>
                        <div class="col-sm-6 col-md-3">
                            <div class="form-group form-focus select-focus">
                                <label class="focus-label">Role</label>
                                <select class="select floating" onchange="searchByRole(this.options[this.selectedIndex].value)">
                                    <option>Chọn Role</option>
                                    <c:forEach items="${LIST_ROLE}" var="r">
                                        <option value="${r.getId()}">${r.getName()}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="col-sm-6 col-md-3">
                            <a href="#" class="btn btn-success btn-block"> Tìm Kiếm </a>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="table-responsive">
                                <table class="table table-striped custom-table">
                                    <thead>
                                        <tr>
                                            <th style="min-width:200px;">Tên</th>
                                            <th>ID Nhân Viên</th>
                                            <th>Email</th>
                                            <th>Số Điện Thoại</th>
                                            <th>Role</th>
                                            <th class="text-right">Action</th>
                                        </tr>
                                    </thead>
                                    <tbody id="content">
                                        <c:forEach begin="1" end="8" items="${requestScope.LIST_EMPLOYEES}" var="e">
                                            <tr>
                                                <td>
                                                    <img width="28" height="28" src="assets/img/user.jpg" class="rounded-circle" alt=""> <h2>${e.getFullName()}</h2>
                                                </td>
                                                <td>${e.getId()}</td>
                                                <td>${e.getEmail()}</td>
                                                <td>${e.getPhoneNumber()}</td>
                                                <td>
                                                    <c:choose>
                                                        <c:when test = "${e.getRoleID() ==  1}" ><span class="custom-badge status-green">Admin</span></c:when>
                                                        <c:when test = "${e.getRoleID() ==  2}" ><span class="custom-badge status-red">Nha Sĩ</span></c:when>
                                                        <c:when test = "${e.getRoleID() ==  3}" ><span class="custom-badge status-pink">Marketing</span></c:when>
                                                        <c:otherwise><span class="custom-badge status-purple">Chăm sóc Khách Hàng</span></c:otherwise>
                                                    </c:choose>
                                                </td>
                                                <td class="text-right">
                                                    <div class="dropdown dropdown-action">
                                                        <a href="#" class="action-icon dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-ellipsis-v"></i></a>
                                                        <div class="dropdown-menu dropdown-menu-right">
                                                            <a class="dropdown-item" href="MainController?action=GetEmPloyeeByID&"><i class="fa fa-pencil m-r-5"></i>Chỉnh Sửa</a>
                                                            <a class="dropdown-item" href="#" data-toggle="modal" data-target="#delete_employee"><i class="fa fa-trash-o m-r-5"></i>Delete</a>
                                                        </div>
                                                    </div>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>

                            </div>
                            <div class="pagination p3">
                                <ul>
                                    <c:forEach begin="1" end="${END_PAGE}" var="i">
                                        <a class="paging-link" href="MainController?action=GetEmployees&index=${i}"><li>${i}</li></a>
                                            </c:forEach>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div id="delete_employee" class="modal fade delete-modal" role="dialog">
                <div class="modal-dialog modal-dialog-centered">
                    <div class="modal-content">
                        <div class="modal-body text-center">
                            <img src="assets/img/sent.png" alt="" width="50" height="46">
                            <h3>Are you sure want to delete this Employee?</h3>
                            <div class="m-t-20"> <a href="#" class="btn btn-white" data-dismiss="modal">Close</a>
                                <button type="submit" class="btn btn-danger">Delete</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="sidebar-overlay" data-reff=""></div>
        <script src="assets/js/jquery-3.2.1.min.js"></script>
        <script src="assets/js/popper.min.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.dataTables.min.js"></script>
        <script src="assets/js/dataTables.bootstrap4.min.js"></script>
        <script src="assets/js/jquery.slimscroll.js"></script>
        <script src="assets/js/select2.min.js"></script>
        <script src="assets/js/moment.min.js"></script>
        <script src="assets/js/bootstrap-datetimepicker.min.js"></script>
        <script src="assets/js/app.js"></script>
        <script>
                                    function searchByRole(roleID) {
                                        $.ajax({
                                            url: '/SWP391-SE1743/MainController',
                                            data: {
                                                action: 'Search Employee By Role',
                                                id: roleID
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
                                    function searchByName(text) {
                                        $.ajax({
                                            url: '/SWP391-SE1743/MainController',
                                            data: {
                                                action: 'Search Employee By Name',
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
                                    let pagingLink = document.querySelectorAll('.paging-link');
                                    function activeWork() {
                                        pagingLink.forEach(element => {
                                            element.classList.remove('is-active');
                                            this.classList.add('is-active');
                                        })
                                    }
                                    pagingLink.forEach(element => {
                                        element.addEventListener('click', activeWork)
                                    });
                                    
        </script>
    </body>


    <!-- employees23:22-->
</html>