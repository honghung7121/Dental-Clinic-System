<%-- 
    Document   : addDentist
    Created on : May 21, 2023, 2:31:08 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">


    <!-- add-doctor24:06-->
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
        <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
        <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/select2.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap-datetimepicker.min.css">
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
            
            <div class="page-wrapper">
                <div class="content">
                    <div class="row">
                        <div class="col-lg-8 offset-lg-2">
                            <h4 class="page-title">Thêm Bác Sĩ</h4>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-8 offset-lg-2">
                            <form action="MainController" method="get"> 
                                <div class="row">
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label>Họ và Tên <span class="text-danger">*</span></label>
                                            <input class="form-control" type="text" name="createNameDentist" required="">
                                        </div>
                                    </div>

                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label>Email <span class="text-danger">*</span></label>
                                            <input class="form-control" type="email" name="createEmailDentist" required="">
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <label>Mật Khẩu</label>
                                            <input class="form-control" type="password" name="createPassDentist" required="">
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <label>Nhập Lại Mật Khẩu</label>
                                            <input class="form-control" type="password" name="createPassAgainDentist" required="">
                                        </div>
                                        <h6 style="color: red">${requestScope.report}</h6>
                                    </div>

                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <label>Số điện thoại (10 số)</label>
                                            <input class="form-control" type="number" name="createPhoneDentist" pattern="[0-9]{10}" required="">
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <label>Ảnh Đại Diện</label>
                                            <div class="profile-upload">
                                                <div class="upload-img">
                                                    <img alt="" src="assets/img/user.jpg"  name="createImgDentist" required="">
                                                </div>
                                                <div class="upload-input">
                                                    <input type="file" class="form-control" required="">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="gender">Giới tính:</label>
                                        <select id="gender" name="gender">
                                          <option value="Nam">Nam</option>
                                          <option value="Nữ">Nữ</option>
                                          <option value="Khác">Khác</option>
                                        </select>
                                </div>
                                <div class="form-group">
                                    <label>Kinh nghiệm</label>
                                    <textarea class="form-control" rows="3" cols="30" name="createExperienceDentist" required=""></textarea>
                                </div>
                                <div class="form-group">
                                    <label>Bằng cấp</label>
                                    <textarea class="form-control" rows="3" cols="30" name="createDegreeDentist" required=""></textarea>
                                </div>
                                <div class="form-group">
                                    <label class="display-block">Trạng thái</label>
                                    <div class="form-check form-check-inline">
                                        <input class="form-check-input" type="radio" name="createStatusDentist" id="doctor_active" value="1" checked>
                                        <label class="form-check-label" for="doctor_active">
                                            Đẫ kích hoạt
                                        </label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <input class="form-check-input" type="radio" name="createStatusDentist" id="doctor_inactive" value="0">
                                        <label class="form-check-label" for="doctor_inactive">
                                            Chưa kích hoạt
                                        </label>
                                    </div>
                                </div>
                                <div class="m-t-20 text-center">
                                    <button class="btn btn-primary submit-btn" name="action" value="createDentist">Tạo bác sĩ</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
               
            </div>
        </div>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
        <script>
                            function addDentist() {
                                let createNameDentist = document.getElementById('createNameDentist').value;
                                let createPassDentist = document.getElementById('createPassDentist').value;
                                let createPassAgainDentist = document.getElementById('createPassAgainDentist').value;
                                let createEmailDentist = document.getElementById('createEmailDentist').value;
                                let createPhoneDentist = document.getElementById('createPhoneDentist').value;
                                let createImageDentist = document.getElementById('createImageDentist').value;
                                let gender = document.getElementById('gender').value;
                                let createExperienceDentist = document.getElementById('createExperienceDentist').value;    
                                let createDegreeDentist = document.getElementById('createDegreeDentist').value;  
                                let createStatusDentist = document.getElementById('createStatusDentist').value;  
                                
                                if (createPassDentist !== createPassAgainDentist) {
                                    alert('Mật Khẩu Không Trùng Nhau');
                                }
                                else {
                                    $.ajax({
                                        url: '/SWP391-SE1743/MainController',
                                        data: {
                                            action: 'createDentist',
                                            createNameDentist: createNameDentist,
                                            createPassDentist: createPassDentist,
                                            createEmailDentist: createEmailDentist,
                                            createPhoneDentist: createPhoneDentist,
                                            createImageDentist: createImageDentist,
                                            gender: gender,
                                            createExperienceDentist: createExperienceDentist,
                                            createDegreeDentist: createDegreeDentist,
                                            createStatusDentist: createStatusDentist
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
        </script>

    </body>


    <!-- add-doctor24:06-->
</html>

