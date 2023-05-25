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
                            <div class="col-sm-4 col-3">
                                <h4 class="page-title">Phản Hồi Cho Nha Sĩ</h4>
                            </div>
                            <div class="col-sm-8 col-9 text-right m-b-20">
                                <form action="MainController" method="get">
                                    <input placeholder="Tìm Kiếm" type="text" name="txt" value="">
                                <select name="searchby">
                                    <option value="bycustomername">Theo Tên Khách Hàng</option>
                                    <option value="bydentistname">Theo Tên Nha Sĩ</option>
                                </select>
                                    <button type="submit" name="action" value="Search Feedback Dentist">Tìm Kiếm</button>
                            </form>
                        </div>
                    </div>
                        
                    <div class="row">
                        <div class="col-md-12">
                            <div class="table-responsive">
                                <table id="myTable" class="table table-border table-striped custom-table mb-0">
                                    <thead>
                                        <tr>
                                            <th><a href="#">Feedback ID</a></th>
                                            <th><a href="#">Tên Khách Hàng</a></th>
                                            <th><a href="#">Tên Nha Sĩ</a></th>
                                            <th><a href="#">Đánh Giá</a></th>
                                            <th><a href="#">Nội dung</a></th>
                                            <th class="text-right">Chỉnh sửa</th>
                                        </tr>                                        
                                    </thead>
                                    <tbody>
                                        <c:forEach var="feedback" items="${sessionScope.list}">
                                            <tr>
                                                <td><c:out value="${feedback.getId()}"></c:out></td>
                                                <td><c:out value="${feedback.getNamecustomer()}"></c:out></td>
                                                <td><c:out value="${feedback.getNamedentist()}"></c:out></td>
                                                    <td class="rating">
                                                    <c:set var="rating" value="${feedback.getRate()}" /> <!-- Số điểm rating -->
                                                    <c:forEach begin="1" end="5" var="star">
                                                        <span class="star">
                                                            <c:choose>
                                                                <c:when test="${star <= rating}">
                                                                    &#9733; <!-- Hiển thị ngôi sao đã chọn -->
                                                                </c:when>
                                                                <c:otherwise>
                                                                    &#9734; <!-- Hiển thị ngôi sao chưa chọn -->
                                                                </c:otherwise>
                                                            </c:choose>
                                                        </span>
                                                    </c:forEach>
                                                </td>
                                                <td><c:out value="${feedback.getComment()}"></c:out></td>
                                                    <td class="text-right">
                                                        <div class="dropdown dropdown-action">
                                                            <a href="#" class="action-icon dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-ellipsis-v"></i></a>
                                                            <div class="dropdown-menu dropdown-menu-right">
                                                                <a class="dropdown-item" href="edit-schedule.html"><i class="fa fa-pencil m-r-5"></i> Edit</a>
                                                                <a class="dropdown-item" href="#" data-toggle="modal" data-target="#delete_schedule"><i class="fa fa-trash-o m-r-5"></i> Delete</a>
                                                            </div>
                                                        </div>
                                                    </td>
                                                </tr>
                                        </c:forEach>                                        
                                    </tbody>
                                </table>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="assets/js/title_sort.js"></script>                        

        <script src="assets/js/jquery.dataTables.min.js"></script>
        <script src="assets/js/dataTables.bootstrap4.min.js"></script>

        <script src="assets/js/select2.min.js"></script>
        <script src="assets/js/moment.min.js"></script>
        <script src="assets/js/bootstrap-datetimepicker.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
        <script>
            function searchByName(param) {
                var txtSearch = param.value;
                $.ajax({
                    url: "/SWP391-SE1743/SearchFeedbackDentistController",
                    type: "get", //send it through get method
                    data: {
                        txt: txtSearch
                    },
                    success: function (data) {
                        var row = document.getElementById("content");
                        row.innerHTML = data;
                    },
                    error: function (xhr) {
                        //Do Something to handle error
                    }
                });
            }
        </script>
    </body>
</html>