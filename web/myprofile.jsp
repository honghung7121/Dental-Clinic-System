<%-- 
    Document   : myprofile
    Created on : May 24, 2023, 7:05:02 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <c:set var="u" value="${sessionScope.User}"></c:set>
            <div class="page-wrapper">
                <div class="content">
                    <div class="row">
                        <div class="col-sm-7 col-6">
                            <h4 class="page-title">Thông Tin Của Tôi</h4>
                        </div>

                        <div class="col-sm-5 col-6 text-right m-b-30">
                            <a href="editProfile.jsp" class="btn btn-primary btn-rounded"><i class="fa fa-plus"></i> Chỉnh Sửa</a>
                        </div>
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
                                                <div class="staff-id">Chức vụ: Admin</div>

                                                <div class="staff-msg"><a href="MainController?action=changePassPage" class="btn btn-primary btn-rounded">Thay đổi mật khẩu</a></div>

                                            </div>
                                        </div>
                                        <div class="col-md-7">
                                            <ul class="personal-info">
                                                <li>
                                                    <span class="title">Số Điện Thoại:</span>
                                                    <span class="text"><a href="#">0${u.getPhoneNumber()}</a></span>
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
                                                        <c:when test = "${e.getRoleID() ==  1}" ><span class="text">Admin</span></c:when>
                                                        <c:when test = "${e.getRoleID() ==  3}" ><span class="text">Marketing</span></c:when>
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
                            <li class="nav-item"><a class="nav-link active" href="#solid-rounded-justified-tab1" data-toggle="tab">Lịch Hẹn</a></li>
                            <li class="nav-item"><a class="nav-link" href="#solid-rounded-justified-tab2" data-toggle="tab">Liệu Trình</a></li>
                            <li class="nav-item"><a class="nav-link" href="#solid-rounded-justified-tab3" data-toggle="tab">Hoá Đơn</a></li>
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
                                                                <th style="text-align: center">Ngày Hẹn</th>
                                                                <th style="text-align: center">Giờ Hẹn</th>
                                                                <th style="text-align: center">Dịch Vụ</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                            <tr style="text-align: center">
                                                                <td>1</td>
                                                                <td>13/6/2023</td>
                                                                <td>7:30 AM</td>
                                                                <td>Lấy Tuỷ</td>
                                                            </tr>
                                                            <tr style="text-align: center">
                                                                <td>2</td>
                                                                <td>14/6/2023</td>
                                                                <td>9:00 AM</td>
                                                                <td>Trám Răng</td>
                                                            </tr>
                                                            <tr style="text-align: center">
                                                                <td>2</td>
                                                                <td>15/6/2023</td>
                                                                <td>8:30 AM</td>
                                                                <td>Nhổ Răng</td>
                                                            </tr>
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
                                                                <th style="text-align: center">ID</th>
                                                                <th style="text-align: center">Tên Bác Sĩ</th>
                                                                <th style="text-align: center">Tên Dịch Vụ</th>
                                                                <th style="text-align: center">Email Liên Lạc</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                            <tr style="text-align: center">
                                                                <td>1</td>
                                                                <td>Bình</td>
                                                                <td>Lấy Khoé Chân</td>
                                                                <td>hb1234tv@gmail.com</td>
                                                            </tr>
                                                            <tr style="text-align: center">
                                                                <td>2</td>
                                                                <td>Hưng</td>
                                                                <td>Ngoáy Tay Bao Phê</td>
                                                                <td>bintran7121@gmail.com</td>
                                                            </tr>
                                                            <tr style="text-align: center">
                                                                <td>2</td>
                                                                <td>Nhật</td>
                                                                <td>Khám Tổng Quát</td>
                                                                <td>levannhat574602@gmail.com</td>
                                                            </tr>
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
    </body>
</html>
