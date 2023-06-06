<%-- 
    Document   : confirmEmail
    Created on : Jun 4, 2023, 12:37:36 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">


    <!-- forgot-password24:03-->
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
        <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
        <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
        <!--[if lt IE 9]>
                    <script src="assets/js/html5shiv.min.js"></script>
                    <script src="assets/js/respond.min.js"></script>
            <![endif]-->
    </head>

    <body>

        <div class="main-wrapper account-wrapper">
            <div class="account-page">
                <div class="account-center">
                    <div class="account-box">
                        <form>
                            <div class="account-logo">
                                <a href="https://accounts.google.com/v3/signin/identifier?dsh=S-972331380%3A1685858268955187&ffgf=1&ifkv=Af_xneFEUhmDNwyUiNTGfIQP16MFBBaZZBtytQejB_6eBSoYZf0ZMwwksPC80SNo6F-hA5GoHlBJvg&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin" target="_blank"><img src="assets/img/gmail.png" ></a>
                            </div>
                            <div class="form-group" id="formCode">
                                <label>Nhập Mã Xác Nhận Của Bạn</label>
                                <input type="text" class="form-control" name="maxacnhan"  required="" >
                            </div>
                            <div class="form-group">
                                <label>Nhập Mã Xác Nhận Của Bạn</label>
                                <input type="text" class="form-control" id="code2"  value="${sessionScope.code}" readonly="" required="" >
                            </div>
                            <div class="form-group" id="formPassword">
                                <label>Nhập Mật Khẩu Mới</label>
                                <input type="text" class="form-control" id="password1" name="pass1" required="" >
                            </div>
                            <div class="form-group" >
                                <label>Nhập Lại Mật Khẩu</label>
                                <input type="text" class="form-control" id="password2" name="pass2" required="" >
                            </div>
                            <h6 style="color: red">${requestScope.report}</h6>
                            <div class="form-group text-center">
                                <!--                                <a onclick="password(this)" class="btn btn-primary account-btn">Xác nhận Mã</a>-->
                                <button class="btn btn-primary account-btn" type="submit" name="action" value="codeMail">Xác nhận Mã</button>
                            </div>
                            <div class="text-center register-link">
                                <a href="login.jsp">Quay về đăng nhập</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <script src="assets/js/jquery-3.2.1.min.js"></script>
        <script src="assets/js/popper.min.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/app.js"></script>
        <!--        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
                <script>
                                            function password() {
                                                let code1 = document.getElementById('code1').value;
                                                let code2 = document.getElementById('code2').value;
                                                let password1 = document.getElementById('password1').value;
                                                let password2 = document.getElementById('password2').value;
                                                let labels = Array.from(document.getElementsByClassName('errorMessage'));
                                                labels.forEach(element => {
                                                    element.remove();
                                                });
                                                if (code1.value !== code2.value) {
                                                    let codeForm = document.getElementById('formCode');
                                                    codeForm.innerHTML += '<label class="errorMessage" style="color: red;">Ma Không Trùng Nhau</label>';
                                                } else if (!password1.value.match('[0-9]') || password1.value.length !== 4) {
                                                    let codeForm = document.getElementById('formCode');
                                                    codeForm.innerHTML += '<label class="errorMessage" style="color: red;">ma phải bang 4 </label>';
                                                } else if (password1.value !== password2.value) {
                                                    let passwordForm = document.getElementById('formPassword');
                                                    passwordForm.innerHTML += '<label class="errorMessage" style="color: red;">Mật Khẩu Không Trùng Nhau</label>';
                                                } else if (!password1.value.match('[a-z]') || !password1.value.match('[A-Z]') || !password1.value.match('[0-9]') || password1.value.length < 7) {
                                                    let passwordForm = document.getElementById('formPassword');
                                                    passwordForm.innerHTML += '<label class="errorMessage" style="color: red;">Mật khẩu phải dài hơn 7 kí tự phải chứ 1 ít nhất 1 kí tự HOA 1 số</label>';
                                                } else {
                                                    $.ajax({
                                                        url: '/SWP391-SE1743/MainController',
                                                        data: {
                                                            action: 'codeMail',
                                                            code: code1,
                                                            password: password1,
                                                        },
                                                        success: function (data) {
                                                            div.classList.add('active');
                                                            
                                                        },
                                                        error: function (error) {
                                                            console.log("Fail");
                                                        },
                                                        type: 'POST'
                                                    });
                                                }
                                            }
        
                </script>-->
    </body>



</html>

