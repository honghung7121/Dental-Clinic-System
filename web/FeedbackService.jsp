<%-- 
    Document   : FeedbackService
    Created on : May 22, 2023, 6:49:06 PM
    Author     : Admin
--%>
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
        <div class="main-wrapper">

            <jsp:include page="header.jsp"></jsp:include>
                <div class="page-wrapper">
                    <div class="content">
                        <div class="row">
                            <div class="col-sm-4 col-3">
                                <h4 class="page-title">Phản Hồi Về Dịch Vụ</h4>
                            </div>
                            <div class="col-sm-8 col-9 text-right m-b-20">
                                <form action="MainController" method="get">
                                    <input placeholder="Tìm Kiếm" type="text" name="txt" value="<%= (request.getParameter("txt") == null) ? "" : request.getParameter("txt")%>">
                                <select name="searchby">
                                    <option value="bycustomername">Theo Tên Khách Hàng</option>
                                    <option value="byservicename">Theo Tên Dịch Vụ</option>
                                </select>
                                <button type="submit" name="action" value="Search Feedback Service">Tìm Kiếm</button>
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
                                            <th><a href="#">Tên Dịch Vụ</a></th>
                                            <th><a href="#">Đánh Giá</a></th>
                                            <th><a href="#">Nội dung</a></th>
                                            <th class="text-right">Chỉnh sữa</th>
                                        </tr>

                                    </thead>
                                    <tbody>
                                        <c:forEach var="feedback" items="${sessionScope.list}">
                                            <tr>
                                                <td><c:out value="${feedback.getId()}"></c:out></td>
                                                <td><c:out value="${feedback.getNameCustomer()}"></c:out></td>
                                                <td><c:out value="${feedback.getNameService()}"></c:out></td>
                                                    <td class="rating">
                                                    <c:set var="rating" value="${feedback.getRate()}" /> <!-- Số điểm rating -->
                                                    <c:forEach begin="1" end="5" var="star">
                                                        <span class="star">
                                                            <c:choose>
                                                                <c:when test="${star <= rating}">
                                                                    <span style='color: gold;'>★</span> <!-- Hiển thị ngôi sao đã chọn -->
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
                                                                <a class="dropdown-item delete-schedule" href="#" data-toggle="modal" data-target="#delete_schedule"><i class="fa fa-trash-o m-r-5"></i> Delete</a>
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
<!--            <div id="delete_schedule" class="modal fade delete-modal" role="dialog">
                <div class="modal-dialog modal-dialog-centered">
                    <div class="modal-content">
                        <div class="modal-body text-center">
                            <img src="assets/img/sent.png" alt="" width="50" height="46">
                            <h3>Are you sure want to delete this Schedule?</h3>
                            <div class="m-t-20"> <a href="#" class="btn btn-white" data-dismiss="modal">Close</a>
                                <button type="submit" class="btn btn-danger" id="delete-button">Delete</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>-->
        </div>

        <script src="assets/js/title_sort.js"></script>                        

        <script src="assets/js/jquery.dataTables.min.js"></script>
        <script src="assets/js/dataTables.bootstrap4.min.js"></script>

        <script src="assets/js/jquery.slimscroll.js"></script>
        <script src="assets/js/popper.min.js"></script>

        <script src="assets/js/select2.min.js"></script>
        <script src="assets/js/moment.min.js"></script>
        <script src="assets/js/bootstrap-datetimepicker.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
        <script>
            function searchByName(param) {
                var txtSearch = param.value;
                $.ajax({
                    url: "SWP391-SE1743\SearchFeedbackDentistController",
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
        <script>
            // Lắng nghe sự kiện click của nút "Delete" cho từng mục
            document.querySelectorAll('.delete-schedule').forEach(function (item) {
                item.addEventListener('click', function (event) {
                    event.preventDefault();

                    // Lưu trữ thẻ <tr> chứa thông tin phản hồi
                    var feedbackRow = this.closest('tr');

                    // Lấy giá trị ID từ phần tử <td> trong thẻ <tr>
                    var feedbackId = feedbackRow.querySelector('td:first-child').textContent;

                    // Hiển thị bảng thông báo xác nhận xóa
                    var confirmation = confirm("Bạn có chắc chắn muốn xóa?");

                    // Kiểm tra sự chấp nhận của người dùng
                    if (confirmation) {
                        // Tạo một đường dẫn (URL) mới với action "Delete Feedback Dentist" và ID của phản hồi
                        var url = 'MainController?action=Delete%20Feedback%20Service&id=' + feedbackId;

                        // Chuyển hướng đến đường dẫn mới
                        window.location.href = url;
                    } else {
                        // Xử lý khi người dùng không đồng ý xóa
                        console.log('Hủy xóa');
                        // Có thể thực hiện các hành động khác tại đây (ví dụ: tắt form)
                    }
                });
            });
        </script>
    </body>
</html>
