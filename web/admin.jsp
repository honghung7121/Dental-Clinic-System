<%-- 
    Document   : admin
    Created on : May 20, 2023, 6:00:42 PM
    Author     : ADMIN
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html lang="en">


    <!-- index22:59-->
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
        <link rel="shortcut icon" type="image/x-icon" href="assets/img/logo.png">
        <title>DentCare</title>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/remixicon@3.2.0/fonts/remixicon.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/select2.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap-datetimepicker.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
        <style>
            * {
                box-sizing: border-box;
            }
            .containere {
                background-color: #fff;
                border-radius: 10px;
                box-shadow: 0 2px 10px rgba(0, 0, 0, 0.3);
                width: 500px;
            }
        </style>
    </head>

    <body>
        <c:if test="${sessionScope.User.getRoleID() != 1}"><c:redirect url="login.jsp"/></c:if>
            <div class="main-wrapper">

            <jsp:include page="header.jsp"></jsp:include>
            <fmt:setLocale value = "vi_VN"/>
            <div class="page-wrapper">
                <div class="content">
                    <div class="row">
                        <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                            <div class="dash-widget">
                                <span class="dash-widget-bg1"><i class="ri-money-dollar-box-line"></i></span>
                                <div class="dash-widget-info text-right">
                                    <h3>  <fmt:formatNumber value="${REVENUE}" type = "currency"/> </h3>

                                    <span class="widget-title1">Thu Nhập <i class="fa fa-check" aria-hidden="true"></i></span>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                            <div class="dash-widget">
                                <span class="dash-widget-bg2"><i class="ri-empathize-line"></i></span>
                                <div class="dash-widget-info text-right">
                                    <h3>${PATIENT}</h3>
                                    <span class="widget-title2">Bệnh Nhân <i class="fa fa-check" aria-hidden="true"></i></span>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                            <div class="dash-widget">
                                <span class="dash-widget-bg3"><i class="fa fa-user-md" aria-hidden="true"></i></span>
                                <div class="dash-widget-info text-right">
                                    <h3>${DENTIST}</h3>
                                    <span class="widget-title3">Bác Sĩ <i class="fa fa-check" aria-hidden="true"></i></span>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
                            <div class="dash-widget">
                                <span class="dash-widget-bg4"><i class="ri-calendar-todo-fill"></i></span>
                                <div class="dash-widget-info text-right">
                                    <h3>217</h3>
                                    <span class="widget-title4">Lịch Khám <i class="fa fa-check" aria-hidden="true"></i></span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-12 col-md-6 col-lg-6 col-xl-6">
                            <div class="card">
                                <div class="card-body">
                                    <div class="chart-title">
                                        <h4>Tổng số lịch hẹn</h4>
                                        <span>
                                            <select id="chartOption">
                                                <option value="7Days">7 ngày gần đây</option>
                                                <option value="15Days">15 ngày gần đây</option>
                                                <option value="30Days">Tháng gần đây</option>
                                            </select>
                                        </span>
                                        <span class="float-right"><i class="fa fa-caret-up" aria-hidden="true"></i> 15% Cao hơn tháng trước</span>
                                    </div>	
                                    <canvas id="appointmentChart"></canvas>
                                </div>
                            </div>
                        </div>
                        <!-- -->
                        <div class="col-12 col-md-6 col-lg-6 col-xl-6">
                            <div class="card">
                                <div class="card-body containere">
                                    <div class="chart-title">
                                        <h4>Thống kê Số Sao</h4>
                                    </div>	
                                    <canvas id="pie-chart"></canvas>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
            <script>
                new Chart(document.getElementById('pie-chart'), {
                    type: 'pie',
                    data: {
                        labels: ["1★", "2★", "3★", "4★", "5★"],
                        datasets: [{
                                backgroundColor: ["#ff4545", "#ffa534",
                                    "#ffe234", "#b7dd29", "#57e32c"
                                ],
                                data: [${requestScope.oneStar}, ${requestScope.twoStar}, ${requestScope.threeStar}, ${requestScope.fourStar}, ${requestScope.fiveStar}]
                            }]
                    },
                    options: {
                        title: {
                            display: true,
                            text: 'Pie Chart for admin panel'
                        },
                        responsive: true
                    }
                });
                document.addEventListener('DOMContentLoaded', function () {
                    var ctx = document.getElementById('appointmentChart').getContext('2d');
                    var chartOption = document.getElementById('chartOption');

                    // Dữ liệu số lịch hẹn từ máy chủ hoặc cơ sở dữ liệu của bạn
                    // Dưới đây là dữ liệu mẫu, bạn cần thay thế bằng dữ liệu thực tế
                    var jsonData = '${appData}';
                    var data = JSON.parse(jsonData);
                    var data7Days = new Array();
                    var data15Days = new Array();
                    for (var i = 6; i >= 0; i--) {
                        data7Days[i] = data[23 + i];
                    }
                    for (var i = 14; i >= 0; i--) {
                        data15Days[i] = data[15 + i];
                    }
                    var data30Days = data;

                    // Biểu đồ ban đầu
                    var initialOption = chartOption.value;
                    var initialData = getDataByOption(initialOption);
                    var appointmentChart;
                    createChart(initialData);

                    // Xử lý sự kiện thay đổi combobox
                    chartOption.addEventListener('change', function () {
                        var selectedOption = chartOption.value;
                        var selectedData = getDataByOption(selectedOption);
                        createChart(selectedData);
                    });

                    // Hàm lấy dữ liệu tương ứng với lựa chọn combobox
                    function getDataByOption(option) {
                        if (option === '7Days') {
                            return data7Days;
                        } else if (option === '15Days') {
                            return data15Days;
                        } else if (option === '30Days') {
                            return data30Days;
                        }
                    }

                    // Hàm tạo biểu đồ từ dữ liệu
                    function createChart(data) {
                        var chartConfig = {
                            type: 'bar', // Loại biểu đồ cột
                            data: {
                                labels: getLabels(),
                                datasets: [
                                    {
                                        label: 'Số lịch hẹn',
                                        data: data,
                                        backgroundColor: 'rgba(0, 123, 255, 0.3)',
                                        borderColor: 'rgba(0, 123, 255, 1)',
                                        borderWidth: 2
                                    }
                                ]
                            },
                            options: {
                                responsive: true,
                                scales: {
                                    y: {
                                        beginAtZero: true
                                    }
                                }
                            }
                        };

                        // Cập nhật biểu đồ
                        if (appointmentChart) {
                            appointmentChart.destroy();
                        }
                        appointmentChart = new Chart(ctx, chartConfig);
                    }

                    // Hàm trợ giúp để lấy nhãn cho trục x tương ứng với 7, 15 và 30 ngày gần đây
                    function getLabels() {
                        var labels = [];

                        var currentDate = new Date();
                        if (chartOption.value === "7Days") {
                            for (var i = 6; i >= 0; i--) {
                                var date = new Date(currentDate);
                                date.setDate(date.getDate() - i);
                                labels.push(formatDate(date));
                            }
                        } else if (chartOption.value === "15Days") {
                            for (var i = 14; i >= 0; i--) {
                                var date = new Date(currentDate);
                                date.setDate(date.getDate() - i);
                                labels.push(formatDate(date));
                            }
                        } else if (chartOption.value === "30Days") {
                            for (var i = 29; i >= 0; i--) {
                                var date = new Date(currentDate);
                                date.setDate(date.getDate() - i);
                                labels.push(formatDate(date));
                            }
                        }
                        return labels;
                    }

                    // Hàm trợ giúp để định dạng ngày tháng
                    function formatDate(date) {
                        var day = date.getDate();
                        var month = date.getMonth() + 1;
                        var year = date.getFullYear();
                        return day + '/' + month + '/' + year;
                    }
                });
            </script>
    </body>
</html>