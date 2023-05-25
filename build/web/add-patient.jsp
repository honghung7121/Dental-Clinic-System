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
               <c:if test="${sessionScope.User.getRoleID() != 1}"><c:redirect url="login.jsp"/></c:if>
        <div class="main-wrapper">
        <jsp:include page="header.jsp"></jsp:include>

            <div class="page-wrapper">
                <div class="content">
                    <div class="row">
                        <div class="col-lg-8 offset-lg-2">
                            <h4 class="page-title">Thêm Bệnh Nhân</h4>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-8 offset-lg-2">
                            <form action="MainController" method="post">

                                <div class="row">
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label>Họ và Tên <span class="text-danger">*</span></label>
                                            <input class="form-control" type="text" name="txtname">
                                        </div>
                                    </div>
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label>Email <span class="text-danger">*</span></label>
                                            <input class="form-control" type="email" name="txtemail">
                                        </div>
                                    </div>

                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <label>Mật Khẩu</label>
                                            <input class="form-control" type="password" name="txtpass">
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <label>Nhập Lại Mật Khẩu</label>
                                            <input class="form-control" type="password" name="txtpass2">
                                        </div>
                                    </div>								                               
                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <label>Phone </label>
                                            <input class="form-control" type="text" name="txtphone">
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <label>Roll </label>
                                            <input class="form-control" type="text" name="txtroll">
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
                                   <div class="col-sm-8">
                                                    <button type="submit"  class="btn btn-primary submit-btn" value="Create" name="action">Tạo Bệnh Nhân</button>
                                                </div>
                                            </form>
                            
                                        </div>
                                    </div>
                                </div>
                
                    
                                    <!--                                    <div class="m-t-20 text-center">
                                                                            <a onclick="addPatient(this)" class="btn btn-primary submit-btn">Tạo Bệnh Nhân</a>
                                    <button class="btn btn-primary submit-btn" value="Create" name="action" onclick="addPatient(this)">Tạo Bệnh Nhân</button>
                                                                             <input class="btn btn-primary submit-btn" type="submit" value="Create" name="action">
                                                                        </div>-->
<!--
                            </form>
                        </div>
                    </div>
                </div>-->
                <!--                <div id="popup1" class="overlay">
                                    <div class="popup">
                                        <h2>Thành Công</h2>
                                        <a onclick="closePopUp(this)" class="close" href="#">&times;</a>
                                        <div class="content">
                                            Đã Thêm Mới Bệnh Nhân Thành Công.
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
                        <script>
                                            function addPatient() {
                                                let txtname = document.getElementById('txtname').value;
                                                let txtpass = document.getElementById('txtpass').value;
                                                let txtpass2 = document.getElementById('txtpass2').value;
                                                let txtemail = document.getElementById('txtemail').value;
                                                let txtphone = document.getElementById('txtphone').value;
                                                let txtroll = document.getElementById('txtroll').value;
                                                let status = document.getElementById('status').value;
                                                if (password1 !== password2) {
                                                    alert('Mật Khẩu Không Trùng Nhau');
                                                } else {
                                                    $.ajax({
                                                        url: '/SWP391-SE1743/MainController',
                                                        data: {
                                                            action: 'Create',
                                                            name: txtname,
                                                            password: txtpass,
                                                            email: txtemail,
                                                            phoneNumber: txtphone,
                                                            role: txtroll,
                                                            status: status
                                                        },
                                                        success: function (data) {
                                                            const div = document.querySelector('.overlay');
                                                            div.classList.add('active');
                                                        },
                                                        error: function (error) {
                                                            console("Fail");
                                                        },
                                                        type: 'GET'
                                                    });
                                                }
                                            }
                                            function closePopUp() {
                                                const div = document.querySelector('.overlay');
                                                div.classList.remove('active');
                                            }
                
                                            //<div class="sidebar-overlay" data-reff=""></div>
                                                <script src="assets/js/jquery-3.2.1.min.js"></script>-->
                <script src="assets/js/popper.min.js"></script>
                <script src="assets/js/bootstrap.min.js"></script>
                <script src="assets/js/jquery.slimscroll.js"></script>
                <script src="assets/js/select2.min.js"></script>
                <script src="assets/js/moment.min.js"></script>
                <script src="assets/js/bootstrap-datetimepicker.min.js"></script>
                <script src="assets/js/app.js"></script>
                </body>
                </html>
