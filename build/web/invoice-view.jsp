<%-- 
    Document   : invoiceView
    Created on : Jun 13, 2023, 1:19:25 AM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <<<<<<< HEAD:web/invoice-view.jsp
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
        =======
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
        <link rel="shortcut icon" type="image/x-icon" href="assets/img/logo.png">
        <title>DentCare</title>
        >>>>>>> b4f73161d365cfef80ae4f963c2a3e3f94b03d94:web/invoiceView.jsp
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/dataTables.bootstrap4.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/select2.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap-datetimepicker.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
        <link rel="stylesheet" type="text/css" href="assets/css/search-bar.css">
    </head>

    <body>
        <jsp:include page="headerdentist.jsp"></jsp:include>
            <div class="main-wrapper">
                <div class="page-wrapper">
                    <div class="content">
                        <div class="row">
                            <div class="col-sm-5 col-4">
                                <h4 class="page-title">Hoá Đơn: ${sessionScope.nameCus}</h4>
                        </div>

                    </div>
                    <div class="row" style="text-align: center">
                        <div class="col-md-12">
                            <div class="card">
                                <div class="card-body">
                                    <div class="row custom-invoice">
                                        <div class="col-6 col-sm-6 m-b-20">
                                            <img src="assets/img/logo.png" class="inv-logo" alt="">
                                            <ul class="list-unstyled">
                                                <h1 class="m-0 text-primary"></i>DentCare</h1>
                                            </ul>
                                        </div>
                                        <div class="col-6 col-sm-6 m-b-20">
                                            <div class="invoice-details">
                                                <h3 class="text-uppercase">Hoá Đơn #ID-${sessionScope.idTreatment}</h3>
                                            </div>
                                        </div>
                                    </div>
                                    <!--                                    <div class="row">
                                                                            <div class="col-sm-6 col-lg-6 m-b-20">
                                    
                                                                                <h5>Hoá Đơn:</h5>
                                                                                <ul class="list-unstyled">
                                                                                    <li>
                                                                                        <h5><strong>Barry Cuda</strong></h5>
                                                                                    </li>
                                                                                    <li><span>Global Technologies</span></li>
                                                                                    <li>5754 Airport Rd</li>
                                                                                    <li>Coosada, AL, 36020</li>
                                                                                    <li>United States</li>
                                                                                    <li>888-777-6655</li>
                                                                                    <li><a href="#">barrycuda@example.com</a></li>
                                                                                </ul>
                                    
                                                                            </div>
                                                                            <div class="col-sm-6 col-lg-6 m-b-20">
                                                                                <div class="invoices-view">
                                                                                    <span class="text-muted">Payment Details:</span>
                                                                                    <ul class="list-unstyled invoice-payment-details">
                                                                                        <li>
                                                                                            <h5>Total Due: <span class="text-right">$288.2</span></h5>
                                                                                        </li>
                                                                                        <li>Bank name: <span>Profit Bank Europe</span></li>
                                                                                        <li>Country: <span>United Kingdom</span></li>
                                                                                        <li>City: <span>London E1 8BF</span></li>
                                                                                        <li>Address: <span>3 Goodman Street</span></li>
                                                                                        <li>IBAN: <span>KFH37784028476740</span></li>
                                                                                        <li>SWIFT code: <span>BPT4E</span></li>
                                                                                    </ul>
                                                                                </div>
                                                                            </div>
                                                                        </div>-->
                                    <div class="table-responsive">
                                        <table class="table table-striped table-hover" >
                                            <thead>
                                                <tr>
                                                    <th>STT</th>
                                                    <th><a href="#">Dịch Vụ</a></th>
                                                    <th>Mô Tả</th>

                                                    <th><a href="#">Trạng Thái Thanh Toán</a></th>
                                                    <th>Giá Tiền</th>
                                                </tr>
                                            </thead>
                                            <tbody id="content">
                                                <fmt:setLocale value = "vi_VN"/>
                                                <c:set var="totalAmount" value="0" />
                                                <c:forEach var="listD" items="${TreatmentDetailList}" varStatus="status">

                                                    <tr style="text-align: center">
                                                        <td>${status.index + 1}</td>


                                                        <td>${listD.nameService}</td>
                                                        <td>${listD.description}</td>

                                                        <c:if test="${listD.statusPaid == false}">
                                                            <td style="color: #35BA67; font-weight: bold;">Chưa thanh toán</td>
                                                            <c:set var="totalAmount" value="${totalAmount + listD.price}" />
                                                        </c:if>
                                                        <c:if test="${listD.statusPaid == true}">
                                                            <td style="color: red; font-weight: bold;">Đã thanh toán</td>
                                                            
                                                        </c:if>
                                                        <td><fmt:formatNumber value="${listD.price}" type = "currency"/></td>
                                                    </tr>
                                                </c:forEach>                                       
                                            </tbody>
                                        </table>
                                    </div>

                                    <div>
                                        <div class="row invoice-payment">
                                            <div class="col-sm-7">
                                            </div>
                                            <div class="col-sm-5">
                                                <div class="m-b-20">
                                                    <div class="table-responsive no-border">
                                                        <table class="table mb-0">
                                                            <tbody>
                                                                <tr>
                                                                    <th>Tổng Tiền</th>
                                                                    <td class="text-right text-primary">
                                                                        <h5><fmt:formatNumber value="${totalAmount}" type="currency"/></h5>
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <th>QR Thanh Toán</th>
                                                                    <td class="text-right text-primary" >
                                                                        <img style="max-height: 200px;" src="assets/img/QR.jpg" class="inv-logo" alt="">
                                                                    </td>
                                                                </tr>
                                                                <tr>

                                                                    <th></th>
                                                                    <td class="text-right text-primary" ><a style="background-color: #009efb; color: #fff;" onclick="confirmPayment()" class="btn btn-primary">Xác Nhận Thanh Toán</a></td>
                                                                </tr>
                                                            </tbody>
                                                        </table>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
        <div class="sidebar-overlay" data-reff=""></div>
        <script src="assets/js/jquery-3.2.1.min.js"></script>
        <script src="assets/js/popper.min.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.slimscroll.js"></script>
        <script src="assets/js/app.js"></script>
        <script>
                                                                            // Function to handle the confirmation alert
                                                                            function confirmPayment() {
                                                                                var isConfirmed = confirm("Bạn có chắc chắn muốn xác nhận thanh toán?");
                                                                                if (isConfirmed) {
                                                                                    // If the user confirms, proceed with payment confirmation
                                                                                    window.location.href = "InvoicesConfirmController?totalAmount=${totalAmount}";
                                                                                } else {
                                                                                    // If the user cancels, do nothing
                                                                                }
                                                                            }
        </script>
    </body>
</html>
