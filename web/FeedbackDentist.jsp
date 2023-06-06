<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">


    <!-- employees23:21-->
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
        <c:set var="role" value="${sessionScope.role}" />
        <c:set var="isAdmin" value="${role eq 1}" />
        <c:set var="isMarketing" value="${role eq 3}" />
        <div class="main-wrapper">
            <c:if test="${isMarketing}">
                <jsp:include page="headerMarketing.jsp"></jsp:include>
                    <div class="page-wrapper">
                        <div class="content">
                            <div class="row">
                                <div class="col-sm-4 col-3">
                                    <h4 class="page-title">Phản Hồi Cho Nha Sĩ</h4>
                                </div>
                                <div class="col-sm-8 col-9 text-right m-b-20">
                                    <form action="MainController" method="post" accept-charset="UTF-8">
                                        <input placeholder="Tìm Kiếm" type="text" name="txt" value="<c:out value="${empty param.txt ? '' : param.txt}" escapeXml="false" />">
                                    <select name="searchby">
                                        <option value="bycustomername">Theo Tên Khách Hàng</option>
                                        <option value="bydentistname">Theo Tên Nha Sĩ</option>
                                    </select>
                                    <button type="submit" name="action" value="Search Feedback Dentist">Tìm Kiếm</button>
                                </form>
                            </div>
                        </div>
                        <!--                            <div class="row filter-row">
                                                        <div class="col-sm-6 col-md-3">
                                                            <div class="form-group form-focus">
                                                                <label class="focus-label">Tìm Phản Hồi</label>
                                                                <input oninput="searchByName(this)" type="text" name="txt" class="form-control floating">
                                                                <select name="searchby">
                                                                    <option value="bycustomername">Theo Tên Khách Hàng</option>
                                                                    <option value="bydentistname">Theo Tên Nha Sĩ</option>
                                                                </select>
                                                            </div>
                                                        </div>
                                                    </div>-->
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
                                            </tr>                                        
                                        </thead>
                                        <tbody id="content">
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
                                                                        <span style='color: gold;'>★</span>  <!-- Hiển thị ngôi sao đã chọn -->
                                                                    </c:when>
                                                                    <c:otherwise>
                                                                        &#9734; <!-- Hiển thị ngôi sao chưa chọn -->
                                                                    </c:otherwise>
                                                                </c:choose>
                                                            </span>
                                                        </c:forEach>
                                                    </td>
                                                    <td><c:out value="${feedback.getComment()}"></c:out></td>
                                                    </tr>
                                            </c:forEach>                                        
                                        </tbody>
                                    </table>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </c:if>
        </div>
        <script src="assets/js/title_sort.js"></script>                        

        <script src="assets/js/jquery.dataTables.min.js"></script>
        <script src="assets/js/dataTables.bootstrap4.min.js"></script>

        <script src="assets/js/jquery.slimscroll.js"></script>
        <script src="assets/js/popper.min.js"></script>

        <script src="assets/js/select2.min.js"></script>
        <script src="assets/js/moment.min.js"></script>
        <script src="assets/js/bootstrap-datetimepicker.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
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
                        // Gửi yêu cầu AJAX để xóa phần tử
                        var xhr = new XMLHttpRequest();
                        xhr.open('GET', 'MainController?action=Delete%20Feedback%20Dentist&id=' + feedbackId);
                        xhr.onload = function () {
                            if (xhr.status === 200) {
                                // Xóa phần tử khỏi giao diện
                                feedbackRow.remove();
                            } else {
                                console.error('Đã xảy ra lỗi khi xóa phản hồi.');
                            }
                        };
                        xhr.send();
                    } else {
                        // Xử lý khi người dùng không đồng ý xóa
                        console.log('Hủy xóa');
                        // Có thể thực hiện các hành động khác tại đây (ví dụ: tắt form)
                    }
                });
            });
        </script>  
        <script>
            function searchByName(param) {
                var txtSearch = param.value;
                var searchBy = document.getElementsByName("searchby")[0].value;
                $.ajax({
                    url: "MainController?action=Search Feedback Dentist",
                    type: "get",
                    data: {
                        txt: txtSearch,
                        searchby: searchBy
                    },
                    success: function (data) {
                        let row = document.getElementById("content");
                        row.innerHTML = data;
                    },
                    error: function (xhr) {
                        console.error(xhr);
                    }
                });
            }

        </script>


    </body>
</html>