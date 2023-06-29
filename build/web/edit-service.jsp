<%-- 
    Document   : edit-service
    Created on : May 21, 2023, 2:49:25 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
                                <h4 class="page-title">Chỉnh Sửa Dịch Vụ</h4>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-8 offset-lg-2">
                                <div class="row">
                                    <fmt:setLocale value = "vi_VN"/>
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label>ID <span class="text-danger">*</span></label>
                                            <input class="form-control" type="text" readonly="" value="${detail.id}" name="id" >
                                        </div>
                                    </div>
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label>Tên dịch vụ <span class="text-danger">*</span></label>
                                            <input class="form-control" type="text" value="${detail.name}" name="name" id="name">
                                        </div>
                                    </div>
                                    <div class="col-sm-12">
                                        <div class="form-group"> 
                                            <label>Mô tả <span class="text-danger">*</span></label>
                                            <textarea rows="7" class="form-control" type="text"  name="mota" id="mota">${detail.mota}</textarea>
                                        </div>
                                    </div>
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label>Giá tiền <span class="text-danger">*</span></label>
                                            <!--value="<fmt:formatNumber value="${detail.price}" type="currency"/>"-->
                                            <input class="form-control" type="text" value="${detail.price}" type="currency" name="price" id="price">
                                        </div>
                                    </div>
                                </div>
                            <div class="form-group">
                                <label class="display-block">Trạng Thái</label>
                                <div class="form-check form-check-inline">
                                    <input class="form-check-input" type="radio" id="status" name="status" id="product_active" value="true" checked>
                                    <label class="form-check-label" for="product_active">
                                        Đang hoạt động
                                    </label>
                                </div>
                                <div class="form-check form-check-inline">
                                    <input class="form-check-input" type="radio" id="status" name="status" id="product_inactive" value="false">
                                    <label class="form-check-label" for="product_inactive">
                                        Ngừng hoạt động
                                    </label>
                                </div>
                            </div>
                            <div class="m-t-20 text-center"> 
                                <button onclick="editService(this, ${detail.id})" class="btn btn-primary submit-btn">LƯU</button>
                            </div>

                        </div>
                    </div>
                </div>

            </div>
        </div>
        <script src="assets/js/jquery.dataTables.min.js"></script>
        <script src="assets/js/dataTables.bootstrap4.min.js"></script>

        <script src="assets/js/select2.min.js"></script>
        <script src="assets/js/moment.min.js"></script>
        <script src="assets/js/bootstrap-datetimepicker.min.js"></script>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
        <script>
                                    function editService(btn, id) {
                                        console.log(btn);

                                        let name = document.getElementById('name').value;
                                        let mota = document.getElementById('mota').value;
                                        let price = document.getElementById('price').value;
                                        let status = document.querySelector('input[name=status]:checked').value;
                                        console.log(name);
                                        $.ajax({
                                            url: '/SWP391-SE1743/MainController',
                                            data: {
                                                action: 'UpdateService',
                                                id: id,
                                                name: name,
                                                mota: mota,
                                                price: price,
                                                status: status
                                            },
                                            success: function (data) {
                                                alert("Cập Nhật Thành Công");
                                            },
                                            error: function (error) {
                                                console("Fail");
                                            },
                                            type: 'GET'
                                        });
                                    }
        </script>
    </body>
</html>