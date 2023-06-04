<%-- 
    Document   : dentists
    Created on : May 20, 2023, 5:50:49 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">


    <!-- doctors23:12-->
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
        <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
        <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>
        <link
            href="https://fonts.googleapis.com/css2?family=Be+Vietnam+Pro:wght@100;300;400;500;800&family=Poppins:wght@400;500;600;700&display=swap"
            rel="stylesheet">

        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/select2.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap-datetimepicker.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
    </head>

    <body>
        <c:if test="${sessionScope.User.getRoleID() != 1}"><c:redirect url="login.jsp"/></c:if>
            <div class="main-wrapper">
            <jsp:include page="header.jsp"></jsp:include>


                <div class="page-wrapper">
                    <div class="content">
                        <div class="row">
                            <div class="col-sm-4 col-3">
                                <h4 class="page-title">Quản Lý Bác Sĩ</h4>
                            </div>
                            <div class="col-sm-8 col-9 text-right m-b-20">
                                <a href="addDentist.jsp" class="btn btn-primary btn-rounded float-right"><i class="fa fa-plus"></i> Thêm Bác Sĩ</a>
                            </div>
                        </div>
                        <div id="showDentist" class="row doctor-grid">


                        <c:set var="listDentist" value="${requestScope.listDentist}"></c:set>     
                        <c:forEach var="dentist" items="${listDentist}">
                            <div class="dentistProduct col-md-4 col-sm-4  col-lg-3">
                                <div class="profile-widget">
                                    <div class="doctor-img">
                                        <a class="avatar" href="MainController?action=dentistProfile&dentistID=${dentist.id}"><img alt="" src="${dentist.img}"></a>
                                    </div>
                                    <div class="dropdown profile-action">
                                        <a href="#" class="action-icon dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-ellipsis-v"></i></a>
                                        <div class="dropdown-menu dropdown-menu-right">
                                            <a class="dropdown-item" href="editDentist.jsp?dentistID=${dentist.id}"><i class="fa fa-pencil m-r-5"></i> Chỉnh sửa</a>
                                            <a class="dropdown-item delete-schedule" href="MainController?action=deleteDentist&dentistID=${dentist.id}"><i class="fa fa-trash-o m-r-5"></i> Xóa Nhân Viên</a>
                                        </div>
                                    </div>
                                    <h4 class="doctor-name text-ellipsis"><a href="MainController?action=dentistProfile&dentistID=${dentist.id}">${dentist.fullName}</a></h4>
                                    <div class="user-country">
                                        <i class="fa fa-map-marker"></i> ${dentist.degree}
                                    </div>
                                </div>
                            </div>
                        </c:forEach>




                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12">
                        <div class="see-all">
                            <button class="see-all-btn" onclick="loadMoreDentist()">Load More</button>
                        </div>
                    </div>
                </div>
            </div>

            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>          
            <script>
                                function loadMoreDentist() {
                                    var amount = document.getElementsByClassName("dentistProduct").length;
                                    $.ajax({
                                        url: "/SWP391-SE1743/LoadMoreDentistController",
                                        type: "get", //send it through get method
                                        data: {
                                            exits: amount
                                        },
                                        success: function (data) {
                                            var row = document.getElementById("showDentist");
                                            row.innerHTML += data;
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
                            var url = 'MainController?action=deleteDentist&dentistID=' + feedbackId;

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


    <!-- doctors23:17-->
</html>