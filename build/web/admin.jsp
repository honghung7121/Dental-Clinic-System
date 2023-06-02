
    Document   : admin
    Created on : May 20, 2023, 6:00:42 PM
    Author     : ADMIN


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html lang="en">


    <!-- index22:59-->
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
        <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
        <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/remixicon@3.2.0/fonts/remixicon.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
        <!--[if lt IE 9]>
                    <script src="assets/js/html5shiv.min.js"></script>
                    <script src="assets/js/respond.min.js"></script>
            <![endif]-->
    </head>

    <body>
        <c:if test="${sessionScope.User.getRoleID() != 1}"><c:redirect url="login.jsp"/></c:if>
        <div class="main-wrapper">
            
            <jsp:include page="header.jsp"></jsp:include>
            <fmt:setLocale value = "vi_VN"/>
            
            <div class="page-wrapper">
                <div class="content">
                    <div class="row">
                        <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                            <div class="dash-widget">
                                <span class="dash-widget-bg1"><i class="ri-money-dollar-box-line"></i></span>
                                <div class="dash-widget-info text-right">
                                    <h3>  <fmt:formatNumber value="${REVENUE}" type = "currency"/> </h3>
                                  
                                    <span class="widget-title1">Thu Nhập <i class="fa fa-check" aria-hidden="true"></i></span>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                            <div class="dash-widget">
                                <span class="dash-widget-bg2"><i class="ri-empathize-line"></i></span>
                                <div class="dash-widget-info text-right">
                                    <h3>${PATIENT}</h3>
                                    <span class="widget-title2">Bệnh Nhân <i class="fa fa-check" aria-hidden="true"></i></span>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                            <div class="dash-widget">
                                <span class="dash-widget-bg3"><i class="fa fa-user-md" aria-hidden="true"></i></span>
                                <div class="dash-widget-info text-right">
                                    <h3>${DENTIST}</h3>
                                    <span class="widget-title3">Bác Sĩ <i class="fa fa-check" aria-hidden="true"></i></span>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                            <div class="dash-widget">
                                <span class="dash-widget-bg4"><i class="ri-calendar-todo-fill"></i></span>
                                <div class="dash-widget-info text-right">
                                    <h3>217</h3>
                                    <span class="widget-title4">Lịch Khám <i class="fa fa-check" aria-hidden="true"></i></span>
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
                                    <a href="MainController?action=dentist" class="text-muted">Xem tất cả bác sĩ</a>
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
            </div>
        </div>
    </body>
</html>
