<%-- 
    Document   : patient
    Created on : 20-May-2023, 22:17:43
    Author     : Admin
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Models.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
        <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
        <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/select2.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/dataTables.bootstrap4.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap-datetimepicker.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
        <div class="main-wrapper">
            <div class="header">
                <div class="header-left">
                    <a href="index-2.html" class="logo">
                        <img src="image\logo.png" width="35" height="35" alt=""> <span>DentCare</span>
                    </a>
                </div>
                <ul class="nav user-menu float-right">
                    <li class="nav-item dropdown has-arrow">
                        <a href="#" class="dropdown-toggle nav-link user-link" data-toggle="dropdown">
                            <span class="user-img"><img class="rounded-circle" src="image/user.jpg" width="100" alt="Admin">
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
                            <li>
                                <a href="index-2.html"><i class="fa fa-dashboard"></i> <span>Dashboard</span></a>
                            </li>
                            <li>
                                <a href="doctors.html"><i class="fa fa-user-md"></i> <span>Bác Sĩ</span></a>
                            </li>
                            <li class="active">
                                <a href="MainController?action=patient"><i class="fa fa-wheelchair"></i> <span>Bệnh Nhân</span></a>
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
                                    <li><a href="employees.html">Danh Sách Nhân Viên</a></li>
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
                        <div class="col-sm-4 col-3">
                            <h4 class="page-title">Quản Lý Bệnh Nhân</h4>
                        </div>
                        <div>
                            
                              <form action="MainController" method="post">

            <input type="text" name="txtSearch">
            <input type="submit" value="Tìm kiếm" name="action">

        </form>
                        </div>
                        <div class="col-sm-12 col-9 text-right m-b-20">
                            <a href="add-patient.jsp" class="btn btn btn-primary btn-rounded float-right"><i class="fa fa-plus"></i> Thêm Bệnh Nhân</a>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="table-responsive">
                                <table class="table table-border table-striped custom-table datatable mb-0">

                                    <thead>
                                        <tr>
                                            <th>Họ và Tên</th>
                                            <th>Số điện thoại</th>
                                            <th>Email</th>
                                            <th>Roll</th>
                                            <th class="text-right">Action</th>
                                        </tr> 
                                    </thead>
                                    <tbody>
                                        <%
                                            ArrayList<User> list = new ArrayList<>();
                                            list = (ArrayList<User>) request.getAttribute("patient");
                                            if (list != null) {
                                                for (User p : list) {
                                        %>
                                        <tr>
                                        
                                            <th><img width="28" height="28" src="image/user.jpg" class="rounded-circle m-r-5" alt=""><%= p.getFullName()%></th>
                                            <th><%= p.getPhoneNumber()%></th>
                                            <th><%= p.getEmail()%></th>
                                            <th><%= p.getRoll() %></th>
                                            <th>
                                            <td class="text-right">
                                                <div class="dropdown dropdown-action">
                                                    <a href="#" class="action-icon dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-ellipsis-v"></i></a>
                                                    <div class="dropdown-menu dropdown-menu-right">
                                                        <a class="dropdown-item" href="edit-patient.jsp"><i class="fa fa-pencil m-r-5"></i> Edit</a>
                                                        <a class="dropdown-item" href="#" data-toggle="modal" data-target="#delete_patient"><i class="fa fa-trash-o m-r-5"></i> Delete</a>
                                                    </div>
                                                </div>
                                            </td>
                                            </th>

                                        </tr>

                                        <%
                                                }
                                            }
                                        %>



                                    </tbody>



                                    </body>
                                    </html>
