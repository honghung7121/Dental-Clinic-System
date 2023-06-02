<%-- 
    Document   : add-patient
    Created on : 21-May-2023, 13:27:14
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
        <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
        <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/select2.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap-datetimepicker.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
        <title>JSP Page</title>

    </head>
    <body>
        <div class="main-wrapper">
            <div class="header">
                <div class="header-left">
                    <a href="index-2.html" class="logo">
                        <img src="image/logo.png" width="35" height="35" alt=""> <span>DentCare</span>
                    </a>
                </div>
                   <ul class="nav user-menu float-right">
                    <li class="nav-item dropdown has-arrow">
                        <a href="#" class="dropdown-toggle nav-link user-link" data-toggle="dropdown">
                            <span class="user-img"><img class="rounded-circle" src="image/user.jpg" width="40" alt="Admin">
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
                    </ul>
                    
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
                            <li >
                                <a href="doctors.html"><i class="fa fa-user-md"></i> <span>Bác Sĩ</span></a>
                            </li>
                            <li class="active">
                                <a href="patients.html"><i class="fa fa-wheelchair"></i> <span>Bệnh Nhân</span></a>
                            </li>
                            <li>
                                <a href="appointments.html"><i class="fa fa-calendar"></i> <span>Cuộc Hẹn</span></a>
                            </li>
                            <li>
                                <a href="schedule.html"><i class="fa fa-calendar-check-o"></i> <span>Doctor Schedule</span></a>
                            </li>
                            <li>
                                <a href="departments.html"><i class="fa fa-hospital-o"></i> <span>Departments</span></a>
                            </li>
                            <li class="submenu">
                                <a href="#"><i class="fa fa-user"></i> <span> Employees </span> <span class="menu-arrow"></span></a>
                                <ul style="display: none;">
                                    <li><a href="employees.html">Employees List</a></li>
                                    <li><a href="leaves.html">Leaves</a></li>
                                    <li><a href="holidays.html">Holidays</a></li>
                                    <li><a href="attendance.html">Attendance</a></li>
                                </ul>
                            </li>
                            <li class="submenu">
                                <a href="#"><i class="fa fa-money"></i> <span> Accounts </span> <span class="menu-arrow"></span></a>
                                <ul style="display: none;">
                                    <li><a href="invoices.html">Invoices</a></li>
                                    <li><a href="payments.html">Payments</a></li>
                                    <li><a href="expenses.html">Expenses</a></li>
                                    <li><a href="taxes.html">Taxes</a></li>
                                    <li><a href="provident-fund.html">Provident Fund</a></li>
                                </ul>
                            </li>
                                    </ul>
                </div>
            </div>
        </div>
                   
                            <div class="page-wrapper">
                                <div class="content">
                                    <div class="row">
                                        <div class="col-lg-8 offset-lg-2">
                                            <h4 class="page-title">Thêm Bệnh Nhân</h4>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-lg-8 offset-lg-2">
                                            <form>
                                                <div class="row">
                                                    <div class="col-sm-12">
                                                        <div class="form-group">
                                                            <label>Họ và Tên <span class="text-danger">*</span></label>
                                                            <input class="form-control" type="text">
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-12">
                                                        <div class="form-group">
                                                            <label>Email <span class="text-danger">*</span></label>
                                                            <input class="form-control" type="email">
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-6">
                                                        <div class="form-group">
                                                            <label>Mật Khẩu</label>
                                                            <input class="form-control" type="password">
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-6">
                                                        <div class="form-group">
                                                            <label>Nhập Lại Mật Khẩu</label>
                                                            <input class="form-control" type="password">
                                                        </div>
                                                    </div>								                               
                                                    <div class="col-sm-6">
                                                        <div class="form-group">
                                                            <label>Phone </label>
                                                            <input class="form-control" type="text">
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-6">
                                                        <div class="form-group">
                                                            <label>Avatar</label>
                                                            <div class="profile-upload">
                                                                <div class="upload-img">
                                                                    <img alt="" src="image/user.jpg">
                                                                </div>
                                                                <div class="upload-input">
                                                                    <input type="file" class="form-control">
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="display-block">Status</label>
                                                    <div class="form-check form-check-inline">
                                                        <input class="form-check-input" type="radio" name="status" id="patient_active" value="option1" checked>
                                                        <label class="form-check-label" for="patient_active">
                                                            Active
                                                        </label>
                                                    </div>
                                                    <div class="form-check form-check-inline">
                                                        <input class="form-check-input" type="radio" name="status" id="patient_inactive" value="option2">
                                                        <label class="form-check-label" for="patient_inactive">
                                                            Inactive
                                                        </label>
                                                    </div>
                                                </div>
                                                <div class="m-t-20 text-center">
                                                    <button class="btn btn-primary submit-btn">Tạo</button>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                                <div class="sidebar-overlay" data-reff=""></div>
                                <script src="assets/js/jquery-3.2.1.min.js"></script>
                                <script src="assets/js/popper.min.js"></script>
                                <script src="assets/js/bootstrap.min.js"></script>
                                <script src="assets/js/jquery.slimscroll.js"></script>
                                <script src="assets/js/select2.min.js"></script>
                                <script src="assets/js/moment.min.js"></script>
                                <script src="assets/js/bootstrap-datetimepicker.min.js"></script>
                                <script src="assets/js/app.js"></script>
                                </body>
                                </html>

