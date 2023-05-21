<%-- 
    Document   : admin
    Created on : May 20, 2023, 5:46:32 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">


    <!-- index22:59-->
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
                            <span class="user-img">
                                <img class="rounded-circle" src="assets/img/user.jpg" width="24" alt="Admin">
                                <span class="status online"></span>
                            </span>
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
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-ellipsis-v"></i></a>
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
                            <li class="active">
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
                                    <li><a href="MainController?action=GetEmployees&index=1">Danh Sách Nhân Viên</a></li>
                                    <li><a href="holidays.html">Ngày Nghỉ</a></li>
                                    <li><a href="attendance.html">Điểm Danh</a></li>
                                </ul>
                            </li>
                            <li class="submenu">
                                <a href="#"><i class="fa fa-money"></i> <span> Tài Khoản </span> <span class="menu-arrow"></span></a>
                                <ul style="display: none;">
                                    <li><a href="invoices.html">Hoá Đơn</a></li>
                                    <li><a href="payments.html">Thanh Toán</a></li>
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
                        <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                            <div class="dash-widget">
                                <span class="dash-widget-bg1"><i class="fa fa-stethoscope" aria-hidden="true"></i></span>
                                <div class="dash-widget-info text-right">
                                    <h3>98</h3>
                                    <span class="widget-title1">Bác Sĩ <i class="fa fa-check" aria-hidden="true"></i></span>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                            <div class="dash-widget">
                                <span class="dash-widget-bg2"><i class="fa fa-user-o"></i></span>
                                <div class="dash-widget-info text-right">
                                    <h3>1072</h3>
                                    <span class="widget-title2">Bệnh Nhân <i class="fa fa-check" aria-hidden="true"></i></span>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                            <div class="dash-widget">
                                <span class="dash-widget-bg3"><i class="fa fa-user-md" aria-hidden="true"></i></span>
                                <div class="dash-widget-info text-right">
                                    <h3>72</h3>
                                    <span class="widget-title3">Có Mặt <i class="fa fa-check" aria-hidden="true"></i></span>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                            <div class="dash-widget">
                                <span class="dash-widget-bg4"><i class="fa fa-heartbeat" aria-hidden="true"></i></span>
                                <div class="dash-widget-info text-right">
                                    <h3>618</h3>
                                    <span class="widget-title4">Chưa Xử Lí <i class="fa fa-check" aria-hidden="true"></i></span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-12 col-md-6 col-lg-6 col-xl-6">
                            <div class="card">
                                <div class="card-body">
                                    <div class="chart-title">
                                        <h4>Tổng số bệnh nhân</h4>
                                        <span class="float-right"><i class="fa fa-caret-up" aria-hidden="true"></i> 15% Cao hơn tháng trước</span>
                                    </div>	
                                    <canvas id="linegraph"></canvas>
                                </div>
                            </div>
                        </div>
                        <div class="col-12 col-md-6 col-lg-6 col-xl-6">
                            <div class="card">
                                <div class="card-body">
                                    <div class="chart-title">
                                        <h4>Thống kê bệnh nhân</h4>
                                        <div class="float-right">
                                            <ul class="chat-user-total">
                                                <li><i class="fa fa-circle current-users" aria-hidden="true"></i>ICU</li>
                                                <li><i class="fa fa-circle old-users" aria-hidden="true"></i> OPD</li>
                                            </ul>
                                        </div>
                                    </div>	
                                    <canvas id="bargraph"></canvas>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-12 col-md-6 col-lg-8 col-xl-8">
                            <div class="card">
                                <div class="card-header">
                                    <h4 class="card-title d-inline-block">Cuộc hẹn sắp tới</h4> <a href="appointments.html" class="btn btn-primary float-right">Xem tất cả</a>
                                </div>
                                <div class="card-body p-0">
                                    <div class="table-responsive">
                                        <table class="table mb-0">
                                            <thead >
                                                <tr>
                                                    <th>Tên bệnh nhân</th>
                                                    <th>Tên bác sĩ</th>
                                                    <th>Thời gian</th>
                                                    <th class="text-right">Trạng thái</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <td style="min-width: 200px;">
                                                        <a class="avatar" href="profile.html">B</a>
                                                        <h2><a href="profile.html">Bernardo Galaviz <span>New York, USA</span></a></h2>
                                                    </td>                 
                                                    <td>
                                                        <h5 class="time-title p-0">Cuộc hẹn với</h5>
                                                        <p>Dr. Thảo</p>
                                                    </td>
                                                    <td>
                                                        <h5 class="time-title p-0">Thời gian</h5>
                                                        <p>7.00 PM</p>
                                                    </td>
                                                    <td class="text-right">
                                                        <a href="appointments.html" class="btn btn-outline-primary take-btn">Take up</a>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td style="min-width: 200px;">
                                                        <a class="avatar" href="profile.html">B</a>
                                                        <h2><a href="profile.html">Bernardo Galaviz <span>New York, USA</span></a></h2>
                                                    </td>                 
                                                    <td>
                                                        <h5 class="time-title p-0">Cuộc hẹn với</h5>
                                                        <p>Dr.Bình</p>
                                                    </td>
                                                    <td>
                                                        <h5 class="time-title p-0">Thời gian</h5>
                                                        <p>8.00 PM</p>
                                                    </td>
                                                    <td class="text-right">
                                                        <a href="appointments.html" class="btn btn-outline-primary take-btn">Take up</a>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td style="min-width: 200px;">
                                                        <a class="avatar" href="profile.html">B</a>
                                                        <h2><a href="profile.html">Bernardo Galaviz <span>New York, USA</span></a></h2>
                                                    </td>                 
                                                    <td>
                                                        <h5 class="time-title p-0">Cuộc hẹn với</h5>
                                                        <p>Dr. Hưng</p>
                                                    </td>
                                                    <td>
                                                        <h5 class="time-title p-0">Thời gian</h5>
                                                        <p>9.00 PM</p>
                                                    </td>
                                                    <td class="text-right">
                                                        <a href="appointments.html" class="btn btn-outline-primary take-btn">Take up</a>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td style="min-width: 200px;">
                                                        <a class="avatar" href="profile.html">B</a>
                                                        <h2><a href="profile.html">Bernardo Galaviz <span>New York, USA</span></a></h2>
                                                    </td>                 
                                                    <td>
                                                        <h5 class="time-title p-0">Cuộc hẹn với</h5>
                                                        <p>Dr. Trí</p>
                                                    </td>
                                                    <td>
                                                        <h5 class="time-title p-0">Thời gian</h5>
                                                        <p>10.00 PM</p>
                                                    </td>
                                                    <td class="text-right">
                                                        <a href="appointments.html" class="btn btn-outline-primary take-btn">Take up</a>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td style="min-width: 200px;">
                                                        <a class="avatar" href="profile.html">B</a>
                                                        <h2><a href="profile.html">Bernardo Galaviz <span>New York, USA</span></a></h2>
                                                    </td>                 
                                                    <td>
                                                        <h5 class="time-title p-0">Cuộc hẹn với</h5>
                                                        <p>Dr. Nhựt</p>
                                                    </td>
                                                    <td>
                                                        <h5 class="time-title p-0">Thời gian</h5>
                                                        <p>11.00 PM</p>
                                                    </td>
                                                    <td class="text-right">
                                                        <a href="appointments.html" class="btn btn-outline-primary take-btn">Take up</a>
                                                    </td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-12 col-md-6 col-lg-4 col-xl-4">
                            <div class="card member-panel">
                                <div class="card-header bg-white">
                                    <h4 class="card-title mb-0">Bác sĩ</h4>
                                </div>
                                <div class="card-body">
                                    <ul class="contact-list">
                                        <li>
                                            <div class="contact-cont">
                                                <div class="float-left user-img m-r-10">
                                                    <a href="profile.html" title="John Doe"><img src="assets/img/user.jpg" alt="" class="w-40 rounded-circle"><span class="status online"></span></a>
                                                </div>
                                                <div class="contact-info">
                                                    <span class="contact-name text-ellipsis">John Doe</span>
                                                    <span class="contact-date">MBBS, MD</span>
                                                </div>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="contact-cont">
                                                <div class="float-left user-img m-r-10">
                                                    <a href="profile.html" title="Richard Miles"><img src="assets/img/user.jpg" alt="" class="w-40 rounded-circle"><span class="status offline"></span></a>
                                                </div>
                                                <div class="contact-info">
                                                    <span class="contact-name text-ellipsis">Richard Miles</span>
                                                    <span class="contact-date">MD</span>
                                                </div>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="contact-cont">
                                                <div class="float-left user-img m-r-10">
                                                    <a href="profile.html" title="John Doe"><img src="assets/img/user.jpg" alt="" class="w-40 rounded-circle"><span class="status away"></span></a>
                                                </div>
                                                <div class="contact-info">
                                                    <span class="contact-name text-ellipsis">John Doe</span>
                                                    <span class="contact-date">BMBS</span>
                                                </div>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="contact-cont">
                                                <div class="float-left user-img m-r-10">
                                                    <a href="profile.html" title="Richard Miles"><img src="assets/img/user.jpg" alt="" class="w-40 rounded-circle"><span class="status online"></span></a>
                                                </div>
                                                <div class="contact-info">
                                                    <span class="contact-name text-ellipsis">Richard Miles</span>
                                                    <span class="contact-date">MS, MD</span>
                                                </div>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="contact-cont">
                                                <div class="float-left user-img m-r-10">
                                                    <a href="profile.html" title="John Doe"><img src="assets/img/user.jpg" alt="" class="w-40 rounded-circle"><span class="status offline"></span></a>
                                                </div>
                                                <div class="contact-info">
                                                    <span class="contact-name text-ellipsis">John Doe</span>
                                                    <span class="contact-date">MBBS</span>
                                                </div>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="contact-cont">
                                                <div class="float-left user-img m-r-10">
                                                    <a href="profile.html" title="Richard Miles"><img src="assets/img/user.jpg" alt="" class="w-40 rounded-circle"><span class="status away"></span></a>
                                                </div>
                                                <div class="contact-info">
                                                    <span class="contact-name text-ellipsis">Richard Miles</span>
                                                    <span class="contact-date">MBBS, MD</span>
                                                </div>
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                                <div class="card-footer text-center bg-white">
                                    <a href="doctors.html" class="text-muted">Xem tất cả bác sĩ</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-12 col-md-6 col-lg-8 col-xl-8">
                            <div class="card">
                                <div class="card-header">
                                    <h4 class="card-title d-inline-block">Bệnh nhân mới </h4> <a href="patients.html" class="btn btn-primary float-right">Xem tất cả</a>
                                </div>
                                <div class="card-block">
                                    <div class="table-responsive">
                                        <table class="table mb-0 new-patient-table">
                                            <tbody>
                                                <tr>
                                                    <td>
                                                        <img width="28" height="28" class="rounded-circle" src="assets/img/user.jpg" alt=""> 
                                                        <h2>John Doe</h2>
                                                    </td>
                                                    <td>Johndoe21@gmail.com</td>
                                                    <td>+1-202-555-0125</td>
                                                    <td><button class="btn btn-primary btn-primary-one float-right">Lấy tuỷ</button></td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <img width="28" height="28" class="rounded-circle" src="assets/img/user.jpg" alt=""> 
                                                        <h2>Richard</h2>
                                                    </td>
                                                    <td>Richard123@yahoo.com</td>
                                                    <td>202-555-0127</td>
                                                    <td><button class="btn btn-primary btn-primary-two float-right">Niềng răng</button></td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <img width="28" height="28" class="rounded-circle" src="assets/img/user.jpg" alt=""> 
                                                        <h2>Villiam</h2>
                                                    </td>
                                                    <td>Richard123@yahoo.com</td>
                                                    <td>+1-202-555-0106</td>
                                                    <td><button class="btn btn-primary btn-primary-three float-right">Nhổ răng</button></td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <img width="28" height="28" class="rounded-circle" src="assets/img/user.jpg" alt=""> 
                                                        <h2>Martin</h2>
                                                    </td>
                                                    <td>Richard123@yahoo.com</td>
                                                    <td>776-2323 89562015</td>
                                                    <td><button class="btn btn-primary btn-primary-four float-right">Tẩy trắng</button></td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-12 col-md-6 col-lg-4 col-xl-4">
                            <div class="hospital-barchart">
                                <h4 class="card-title d-inline-block">Hospital Management</h4>
                            </div>
                            <div class="bar-chart">
                                <div class="legend">
                                    <div class="item">
                                        <h4>Level1</h4>
                                    </div>

                                    <div class="item">
                                        <h4>Level2</h4>
                                    </div>
                                    <div class="item text-right">
                                        <h4>Level3</h4>
                                    </div>
                                    <div class="item text-right">
                                        <h4>Level4</h4>
                                    </div>
                                </div>
                                <div class="chart clearfix">
                                    <div class="item">
                                        <div class="bar">
                                            <span class="percent">16%</span>
                                            <div class="item-progress" data-percent="16">
                                                <span class="title">OPD Patient</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="item">
                                        <div class="bar">
                                            <span class="percent">71%</span>
                                            <div class="item-progress" data-percent="71">
                                                <span class="title">New Patient</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="item">
                                        <div class="bar">
                                            <span class="percent">82%</span>
                                            <div class="item-progress" data-percent="82">
                                                <span class="title">Laboratory Test</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="item">
                                        <div class="bar">
                                            <span class="percent">67%</span>
                                            <div class="item-progress" data-percent="67">
                                                <span class="title">Treatment</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="item">
                                        <div class="bar">
                                            <span class="percent">30%</span>									
                                            <div class="item-progress" data-percent="30">
                                                <span class="title">Discharge</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="notification-box">
                    <div class="msg-sidebar notifications msg-noti">
                        <div class="topnav-dropdown-header">
                            <span>Messages</span>
                        </div>
                        <div class="drop-scroll msg-list-scroll" id="msg_list">
                            <ul class="list-box">
                                <li>
                                    <a href="chat.html">
                                        <div class="list-item">
                                            <div class="list-left">
                                                <span class="avatar">R</span>
                                            </div>
                                            <div class="list-body">
                                                <span class="message-author">Richard Miles </span>
                                                <span class="message-time">12:28 AM</span>
                                                <div class="clearfix"></div>
                                                <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="chat.html">
                                        <div class="list-item new-message">
                                            <div class="list-left">
                                                <span class="avatar">J</span>
                                            </div>
                                            <div class="list-body">
                                                <span class="message-author">John Doe</span>
                                                <span class="message-time">1 Aug</span>
                                                <div class="clearfix"></div>
                                                <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="chat.html">
                                        <div class="list-item">
                                            <div class="list-left">
                                                <span class="avatar">T</span>
                                            </div>
                                            <div class="list-body">
                                                <span class="message-author"> Tarah Shropshire </span>
                                                <span class="message-time">12:28 AM</span>
                                                <div class="clearfix"></div>
                                                <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="chat.html">
                                        <div class="list-item">
                                            <div class="list-left">
                                                <span class="avatar">M</span>
                                            </div>
                                            <div class="list-body">
                                                <span class="message-author">Mike Litorus</span>
                                                <span class="message-time">12:28 AM</span>
                                                <div class="clearfix"></div>
                                                <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="chat.html">
                                        <div class="list-item">
                                            <div class="list-left">
                                                <span class="avatar">C</span>
                                            </div>
                                            <div class="list-body">
                                                <span class="message-author"> Catherine Manseau </span>
                                                <span class="message-time">12:28 AM</span>
                                                <div class="clearfix"></div>
                                                <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="chat.html">
                                        <div class="list-item">
                                            <div class="list-left">
                                                <span class="avatar">D</span>
                                            </div>
                                            <div class="list-body">
                                                <span class="message-author"> Domenic Houston </span>
                                                <span class="message-time">12:28 AM</span>
                                                <div class="clearfix"></div>
                                                <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="chat.html">
                                        <div class="list-item">
                                            <div class="list-left">
                                                <span class="avatar">B</span>
                                            </div>
                                            <div class="list-body">
                                                <span class="message-author"> Buster Wigton </span>
                                                <span class="message-time">12:28 AM</span>
                                                <div class="clearfix"></div>
                                                <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="chat.html">
                                        <div class="list-item">
                                            <div class="list-left">
                                                <span class="avatar">R</span>
                                            </div>
                                            <div class="list-body">
                                                <span class="message-author"> Rolland Webber </span>
                                                <span class="message-time">12:28 AM</span>
                                                <div class="clearfix"></div>
                                                <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="chat.html">
                                        <div class="list-item">
                                            <div class="list-left">
                                                <span class="avatar">C</span>
                                            </div>
                                            <div class="list-body">
                                                <span class="message-author"> Claire Mapes </span>
                                                <span class="message-time">12:28 AM</span>
                                                <div class="clearfix"></div>
                                                <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="chat.html">
                                        <div class="list-item">
                                            <div class="list-left">
                                                <span class="avatar">M</span>
                                            </div>
                                            <div class="list-body">
                                                <span class="message-author">Melita Faucher</span>
                                                <span class="message-time">12:28 AM</span>
                                                <div class="clearfix"></div>
                                                <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="chat.html">
                                        <div class="list-item">
                                            <div class="list-left">
                                                <span class="avatar">J</span>
                                            </div>
                                            <div class="list-body">
                                                <span class="message-author">Jeffery Lalor</span>
                                                <span class="message-time">12:28 AM</span>
                                                <div class="clearfix"></div>
                                                <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="chat.html">
                                        <div class="list-item">
                                            <div class="list-left">
                                                <span class="avatar">L</span>
                                            </div>
                                            <div class="list-body">
                                                <span class="message-author">Loren Gatlin</span>
                                                <span class="message-time">12:28 AM</span>
                                                <div class="clearfix"></div>
                                                <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="chat.html">
                                        <div class="list-item">
                                            <div class="list-left">
                                                <span class="avatar">T</span>
                                            </div>
                                            <div class="list-body">
                                                <span class="message-author">Tarah Shropshire</span>
                                                <span class="message-time">12:28 AM</span>
                                                <div class="clearfix"></div>
                                                <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                            </ul>
                        </div>
                        <div class="topnav-dropdown-footer">
                            <a href="chat.html">See all messages</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="sidebar-overlay" data-reff=""></div>
        <script src="assets/js/jquery-3.2.1.min.js"></script>
        <script src="assets/js/popper.min.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.slimscroll.js"></script>
        <script src="assets/js/Chart.bundle.js"></script>
        <script src="assets/js/chart.js"></script>
        <script src="assets/js/app.js"></script>

    </body>


    <!-- index22:59-->
</html>
