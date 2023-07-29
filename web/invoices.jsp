<%-- 
    Document   : invoices
    Created on : Jul 12, 2023, 10:08:56 PM
    Author     : Admin
--%>

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
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Jost:wght@500;600;700&family=Open+Sans:wght@400;600&display=swap" rel="stylesheet">

        <!-- Icon Font Stylesheet -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
        <link href="lib/animate/animate.min.css" rel="stylesheet">
        <link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />
        <link href="lib/twentytwenty/twentytwenty.css" rel="stylesheet" />

        <!-- Customized Bootstrap Stylesheet -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Template Stylesheet -->
        <link href="css/style.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/dataTables.bootstrap4.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/select2.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap-datetimepicker.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
        <link rel="stylesheet" type="text/css" href="assets/css/search-bar.css">
    </head>
    <body>

        <div class="main-wrapper">
            <jsp:include page="headerdentist.jsp"></jsp:include>
                <div class="page-wrapper">
                    <div class="content">
                        <div class="row">
                            <div class="col-sm-5 col-4">
                                <h4 class="page-title">Hoá Đơn</h4>
                            </div>
                        </div>
                        <div class="row filter-row ">

<!--                            <div class="col-sm-6 col-md-3 offset-md-6">
                                <div class="form-group form-focus select-focus">
                                    <label class="focus-label">Status</label>
                                    <select class="select floating">
                                        <option>Chọn Trạng Thái</option>
                                        <option>Đã Thanh Toán</option>
                                        <option>Chưa Thanh Toán</option>
                                    </select>
                                </div>
                            </div>-->
                            <div class="col-sm-6 col-md-3 ">
<!--                                <a href="#" style="background-color: #28a745;" class="btn btn-success btn-block"> Search </a>-->
                            </div>
                        </div>
                    <c:set var="TreatmentList" value="${requestScope.TreatmentList}"></c:set>
                    <c:set var="CheckPaid" value="${requestScope.CheckPaid}"></c:set>
                        <div class="row" style="text-align: center">
                            <div class="col-md-12">

                                <div class="table-responsive">
                                    <table id="myTable" class="table table-border table-striped custom-table mb-0">
                                        <thead>
                                            <tr>
                                                <th><a href="#">ID Liệu trình</a></th>
                                                <th><a href="#">Tên Khách Hàng</a></th>
                                                <th><a href="#">Tên Liệu Trình</a></th>
                                                <th><a href="#">Trạng thái thanh toán</a></th>
                                                <th><a href="#">Tùy chọn</a></th>
                                            </tr>                                        
                                        </thead>
                                        <tbody id="content">
                                        <c:forEach var="list" items="${TreatmentList}" varStatus="status">
                                            <tr>
                                                <td>${list.getId()}</td>
                                                <td>${list.getNamecustomer()}</td>
                                                <td>${list.getNameTreatment()}</td>
                                                <c:if test="${CheckPaid[status.index] == true}">
                                                    <td style="color: red; font-weight: bold;">Đã Thanh Toán</td>
                                                </c:if>
                                                <c:if test="${CheckPaid[status.index] == false}">
                                                    <td style="color: #35BA67; font-weight: bold;">Chưa Thanh Toán</td>
                                                </c:if>

<!--                                                    <td><a style=" background-color: #009efb;" href="MainController?action=ViewInvoicesDetailByCustomer&idTreatment=${list.getId()}&nameCus=${list.getNamecustomer()}" class="btn btn-primary">Chi tiết</a></td>-->
                                               <c:if test="${CheckPaid[status.index] == true}">
                                                    <td style="padding: 30px;"></td>
                                                </c:if>
                                                <c:if test="${CheckPaid[status.index] == false}">
                                                    <td><a style=" background-color: #009efb;" href="MainController?action=ViewInvoicesDetailByCustomer&idTreatment=${list.getId()}&nameCus=${list.getNamecustomer()}" class="btn btn-primary">Thanh Toán</a></td>
                                                </c:if>
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


    </body>
</html>
