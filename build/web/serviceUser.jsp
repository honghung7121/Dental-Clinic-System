<%-- 
    Document   : serviceUser
    Created on : Jun 8, 2023, 7:53:27 PM
    Author     : Admin
--%>

<%@page import="DAL.ServiceDAO"%>
<%@page import="Models.Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>DentCare - Dental Clinic Website Template</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="Free HTML Templates" name="keywords">
        <meta content="Free HTML Templates" name="description">

        <!-- Favicon -->
        <link href="img/favicon.ico" rel="icon">

        <!-- Google Web Fonts -->

        <link
            href="https://fonts.googleapis.com/css2?family=Be+Vietnam+Pro:wght@100;300;400;500;800&family=Poppins:wght@400;500;600;700&display=swap"
            rel="stylesheet">


        <link href="https://fonts.googleapis.com/css2?family=Be+Vietnam+Pro:wght@100;300;400;500;800&family=Poppins:wght@400;500;600;700&display=swap" rel="stylesheet">
        
        <!-- Icon Font Stylesheet -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
        <link href="lib/animate/animate.min.css" rel="stylesheet">
        <link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />
        <link href="lib/twentytwenty/twentytwenty.css" rel="stylesheet" />

        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/dataTables.bootstrap4.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/select2.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap-datetimepicker.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">

        <!-- Customized Bootstrap Stylesheet -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Template Stylesheet -->
        <link href="css/style.css" rel="stylesheet">
        <style>      
            .btnLink{
                background: none;
                border: none;
                cursor: pointer;
                color: #009ce7;
                font-weight: bold;
            }
        </style>
    </head>
    <body>

        <jsp:include page="headerUser.jsp"></jsp:include>
            <div class="modal fade" id="searchModal" tabindex="-1">
                <div class="modal-dialog modal-fullscreen">
                    <div class="modal-content" style="background: rgba(9, 30, 62, .7);">
                        <div class="modal-header border-0">
                            <button type="button" class="btn bg-white btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body d-flex align-items-center justify-content-center">
                            <div class="input-group" style="max-width: 600px;">
                                <input type="text" class="form-control bg-transparent border-primary p-3" placeholder="Type search keyword">
                                <button class="btn btn-primary px-4"><i class="bi bi-search"></i></button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Full Screen Search End -->


            <!-- Hero Start -->
            <div class="container-fluid bg-primary py-5 hero-header mb-5">
                <div class="row py-3">
                    <div class="col-12 text-center">
                        <h1 class="display-3 text-white animated zoomIn">Dịch vụ</h1>
                        <a href="" class="h4 text-white">Trang chủ</a>
                        <i class="far fa-circle text-white px-2"></i>
                        <a href="" class="h4 text-white">Dịch vụ</a>
                    </div>
                </div>
            </div>
            <!-- Hero End -->


            <!-- Service Start -->
            <div class="container-fluid py-5 wow fadeInUp" data-wow-delay="0.1s">
                <div class="container">
                    <div class="row g-5 mb-5">

                        <div class="col-lg-12">
                            <div class="section-title mb-5">
                                <h5 class="position-relative d-inline-block text-primary text-uppercase">Dịch vụ của chúng tôi</h5>
                                <h1 class="display-5 mb-0">Chúng tôi cung cấp dịch vụ nha khoa chất lượng tốt nhất</h1>
                            </div>
                            <div class="row filter-row">
                                <div class="col-sm-6 col-md-3">
                                    <div class="form-group form-focus">
                                        <label class="focus-label">Tìm Dịch Vụ</label>
                                        <input oninput="searchByName(this)" type="text" class="form-control floating">
                                    </div>
                                </div>
                            </div>


                            <div class="row">
                                <div class="col-md-12">
                                    <div class="table-responsive">
                                        <table id="myTable" class="table table-border table-striped custom-table mb-0">
                                            <thead>
                                                <tr>
                                                    <!--                                                    <th><a href="#">ID </th>-->
                                                    <th><a href="#">Tên Dịch Vụ</th>
                                                    <th><a href="#">Mô Tả</th>
                                                    <th><a href="#">Giá Tiền</th>
                                                    <!--                                                    <th>
                                                                                                            <form action="SortServiceController" method="POST">
                                                                                                                <button class="btnLink" style="">Giá Tiền</button>
                                                                                                                <input type="hidden" name="page" value="${requestScope.current}">
                                                                                                            <input type="hidden" name="count" value="${requestScope.count}">
                                                                                                            <input type="hidden" name="flag" value="us">
                                                                                                        </form>
                                                                                                        </th>-->
                                                <!--                                                <th><a href="#">Trạng Thái</th>-->
                                                <th class="text-center">Đặt Lịch</th>
                                            </tr>
                                        </thead>
                                        <tbody id="content">

                                            <fmt:setLocale value = "vi_VN"/>
                                            <c:forEach var="s" items="${sessionScope.ServiceList}">

                                                <tr>
<!--                                                    <td><c:out value="${s.getId()}"></c:out></td>-->
                                                    <td><c:out value="${s.getName()}"></c:out></td>
                                                    <td><c:out value="${s.getMota()}"></c:out></td>
                                                    <td><fmt:formatNumber value="${s.getPrice()}" type = "currency"/></td>

                                                    <td class="text-right">
                                                        <!--                                                        <button type="button" class="btn btn-primary py-0 px-4 ms-3" data-bs-toggle="modal"
                                                                                                                        data-bs-target="#createModal" aria-label="Search">
                                                                                                                    Đặt lịch
                                                                                                                </button>-->
                                                        <a href="appointment.html" class="btn btn-primary py-0 px-4 ms-3">Đặt lịch</a>
                                                    </td>

                                                </tr>

                                            </c:forEach>

                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>

                        <!-- Full Screen Create Start -->
                        <div class="modal fade" id="createModal" tabindex="-1">
                            <!--                            <div class="modal-dialog">
                                                            <div class="modal-content" style="background: rgba(6, 163, 218, .7);">
                                                                <div class="modal-body d-flex align-items-center justify-content-center">
                                                                    <div class="input-group" style="max-width: 600px; color: white; font-size: 1.2rem;" >
                                                                        Chúng tôi xin lỗi khi phải thông báo lịch bạn vừa chọn đã trùng. Vui lòng chọn lịch hẹn khác.
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>-->
                            <div class="modal-dialog">
                                <div class="modal-content" style="background: rgba(6, 163, 218, .7);">
                                    <form action="xemLich" method="post">
                                        <div class="modal-header">

                                            <h4 class="modal-title" style="color: white;">Thông Tin</h4>
                                            <button type="button" class="btn bg-white btn-close" data-bs-dismiss="modal"
                                                    aria-label="Close"></button>
                                        </div>
                                        <div class="modal-body">


                                            <div class="form-group">
                                                <select class="form-select" aria-label="Default select example">
                                                    <option selected>Lựa chọn dịch vụ</option>
                                                    <option value="1">Dịch vụ 1</option>
                                                    <option value="2">Dịch vụ 2</option>
                                                    <option value="3">Dịch vụ 3</option>
                                                </select>
                                            </div>
                                            <br>
                                            <div class="form-group">
                                                <select class="form-select" aria-label="Default select example">
                                                    <option selected>Lựa chọn nha sĩ</option>
                                                    <option value="1">Nha sĩ 1</option>
                                                    <option value="2">Nha sĩ 2</option>
                                                    <option value="3">Nha sĩ 3</option>
                                                </select>
                                            </div>

                                            <br>

                                            <div class="form-group">
                                                <label style="color: white;">Ngày hẹn</label>
                                                <input name="date" type="date" class="form-control" required></input>
                                            </div>
                                            <div class="form-group">
                                                <label style="color: white;">Thời gian hẹn</label>
                                                <input type="time" name="txtTime" class="form-control" required></input>
                                            </div>
                                        </div>
                                        <div class="modal-footer" style="background: white;">
                                            <input type="button" class=""  value="Xem lịch còn trống">
                                            <input type="submit" class="" style="background: #06A3DA; border: 1;" value="Tạo lịch hẹn">
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <!-- Full Screen Create End -->

                        <c:set var="currentPage" value="${requestScope.current}" ></c:set>
                            <div class="row">
                                <div class="col-sm-12 col-12 text-right m-b-20">
                                    <div>
                                        <ul class="pagination float-right">
                                        <c:if test="${currentPage > 1}">
                                            <li class="page-item">
                                                <a class="page-link" href="ServiceUserController?page=${currentPage - 1}&click=true" tabindex="-1">Previous</a>
                                            </li>
                                        </c:if>

                                        <c:choose>
                                            <c:when test="${currentPage <= 3}">
                                                <c:forEach var="i" begin="${begin1}" end="${end1}">
                                                    <li class="page-item ${click == i ? "active":""}">
                                                        <a class="page-link" href="ServiceUserController?page=${i}&click=true">${i}</a>
                                                    </li>
                                                </c:forEach>
                                            </c:when>
                                            <c:when test="${currentPage > 3}">
                                                <c:forEach var="i" begin="${begin2}" end="${end2}">
                                                    <li class="page-item ${click == i ? "active":""}">
                                                        <a class="page-link" href="ServiceUserController?page=${i}&click=true">${i}</a>
                                                    </li>
                                                </c:forEach>
                                            </c:when>
                                            <c:when test="${currentPage > 6}">
                                                <c:forEach var="i" begin="${begin3}" end="${end3}">
                                                    <li class="page-item ${click == i ? "active":""}">
                                                        <a class="page-link" href="ServiceUserController?page=${i}&click=true">${i}</a>
                                                    </li>
                                                </c:forEach>
                                            </c:when>
                                        </c:choose>
                                        <c:if test="${currentPage < totalPages}">
                                            <li class="page-item">
                                                <a class="page-link" href="ServiceUserController?page=${currentPage + 1}&click=true">Next</a>
                                            </li>
                                        </c:if>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row g-5 wow fadeInUp" data-wow-delay="0.1s">
                    <div class="col-lg-5 wow zoomIn" data-wow-delay="0.3s" style="min-height: 400px;">
                        <div class="twentytwenty-container position-relative h-100 rounded overflow-hidden">
                            <img class="position-absolute w-100 h-100" src="img/before.jpg" style="object-fit: cover;">
                            <img class="position-absolute w-100 h-100" src="img/after.jpg" style="object-fit: cover;">
                        </div>
                    </div>
                    <div class="col-lg-7 service-item wow zoomIn" data-wow-delay="0.9s">
                        <div class="position-relative bg-primary rounded h-100 d-flex flex-column align-items-center justify-content-center text-center p-4">
                            <h3 class="text-white mb-3">Tạo cuộc hẹn</h3>
                            <p class="text-white mb-3">Liên hệ chúng tôi qua số điện thoại dưới đây</p>
                            <h2 class="text-white mb-0">+84 374 312 384</h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Service End -->


        <!-- Full Screen Create Start -->

        <!-- Full Screen Create End -->


        <!-- Newsletter Start -->
        <div class="container-fluid position-relative pt-5 wow fadeInUp" data-wow-delay="0.1s" style="z-index: 1;">
            <div class="container">
                <div class="bg-primary p-5">
                    <form class="mx-auto" style="max-width: 600px;">
                        <div class="input-group">
                            <input type="text" class="form-control border-white p-3" placeholder="Email của bạn">
                            <button class="btn btn-dark px-4">Đăng ký</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- Newsletter End -->


        <jsp:include page="footer.jsp"></jsp:include>


        <!-- Back to Top -->
        <a href="#" class="btn btn-lg btn-primary btn-lg-square rounded back-to-top"><i class="bi bi-arrow-up"></i></a>


        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
        <script src="lib/wow/wow.min.js"></script>
        <script src="lib/easing/easing.min.js"></script>
        <script src="lib/waypoints/waypoints.min.js"></script>
        <script src="lib/owlcarousel/owl.carousel.min.js"></script>
        <script src="lib/tempusdominus/js/moment.min.js"></script>
        <script src="lib/tempusdominus/js/moment-timezone.min.js"></script>
        <script src="lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>
        <script src="lib/twentytwenty/jquery.event.move.js"></script>
        <script src="lib/twentytwenty/jquery.twentytwenty.js"></script>

        <!-- Template Javascript -->
       
        
        <script src="assets/js/popper.min.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.slimscroll.js"></script>
        <script src="assets/js/Chart.bundle.js"></script>
        <script src="assets/js/chart.js"></script>
        <script src="assets/js/app.js"></script>

        <script src="assets/js/title_sort.js"></script>                        

        <script src="assets/js/jquery.dataTables.min.js"></script>
        <script src="assets/js/dataTables.bootstrap4.min.js"></script>

        <script src="assets/js/select2.min.js"></script>
        <script src="assets/js/moment.min.js"></script>
        <script src="assets/js/bootstrap-datetimepicker.min.js"></script>
        <script src="js/main.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
        <script>
            function searchByName(text) {
                $.ajax({
                    url: '/SWP391-SE1743/MainController',
                    data: {
                        action: 'Search Service User By Name',
                        name: text.value
                    },
                    success: function (data) {
                        let row = document.getElementById("content");
                        row.innerHTML = data;
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
