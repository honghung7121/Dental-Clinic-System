<%-- 
    Document   : login
    Created on : May 19, 2023, 9:27:07 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login</title>
        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link
            href="https://fonts.googleapis.com/css2?family=Jost:wght@500;600;700&family=Open+Sans:wght@400;600&display=swap"
            rel="stylesheet">

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

        <!-- Customized Login Stylesheet -->
        <link rel="stylesheet" href="css/login.css">
    </head>

    <body>
    <c:if test="${sessionScope.User.getRoleID() != 1}"><c:redirect url="login.jsp"/></c:if>
    <nav class="navbar navbar-expand-lg bg-white navbar-light shadow-sm px-5 py-3 py-lg-0">
        <a href="index.html" class="navbar-brand p-0">
            <h1 class="m-0 text-primary"><i class="fa fa-tooth me-2"></i>DentCare</h1>
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <div class="navbar-nav ms-auto py-0">
                <a href="index.html" class="nav-item nav-link">Home</a>
                <a href="about.html" class="nav-item nav-link active">About</a>
                <a href="service.html" class="nav-item nav-link">Service</a>
                <div class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Pages</a>
                    <div class="dropdown-menu m-0">
                        <a href="price.html" class="dropdown-item">Pricing Plan</a>
                        <a href="team.html" class="dropdown-item">Our Dentist</a>
                        <a href="testimonial.html" class="dropdown-item">Testimonial</a>
                        <a href="appointment.html" class="dropdown-item">Appointment</a>
                    </div>
                </div>
                <a href="contact.html" class="nav-item nav-link">Contact</a>
            </div>
            <button type="button" class="btn text-dark" data-bs-toggle="modal" data-bs-target="#searchModal"><i
                    class="fa fa-search"></i></button>
            <a href="appointment.html" class="btn btn-primary py-2 px-4 ms-3">Appointment</a>
        </div>
    </nav>

        <div class="login-wrap">
            <div class="login-html">
                <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign In</label>
                <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>
                <div class="login-form">
                    <div class="sign-in-htm">
                        <form action="MainController" method="POST">
                            <div class="group">
                                <label for="user" class="label">Username</label>
                                <input id="user" name="accountName" type="text" class="input">
                            </div>
                            <div class="group">
                                <label for="pass" class="label">Password</label>
                                <input id="pass" name="password" type="password" class="input" data-type="password">
                            </div>
                            <div class="group">
                                <input id="check" type="checkbox" class="check" checked>
                                <label for="check"><span class="icon"></span> Keep me Signed in</label></br>
                                <small style="color: #00E77F; margin-top: .3rem; font-size: 1rem">${requestScope.SIGNUP_SUCCESSFULLY}</small>
                                <small style="color: red; margin-top: .3rem; font-size: 1rem">${requestScope.SIGNUP_FAIL}</small>
                            </div>
                            <div class="group">
                                <input style="background-color: #06A3DA;" type="submit" class="button" name="action" value="Login">
                            </div>
                        </form>
                        <div class="hr"></div>
                        <div class="foot-lnk">
                            <a href="forgotPassword.jsp">Forgot Password?</a>
                        </div>
                    </div>
                    <div class="sign-up-htm">
                        <div class="group">
                            <label for="user" class="label">Username</label>
                            <input id="user" name="accountName" type="text" class="input">
                        </div>
                        <div class="group">
                            <label for="pass" class="label">Password</label>
                            <input id="pass" name="password" type="password" class="input" data-type="password">
                        </div>
                        <div class="group">
                            <input id="check" type="checkbox" class="check" checked>
                            <label for="check"><span class="icon"></span> Keep me Signed in</label></br>
                            <small style="color: #00E77F; margin-top: .3rem; font-size: 1rem">${requestScope.SIGNUP_SUCCESSFULLY}</small>
                            <small style="color: red; margin-top: .3rem; font-size: 1rem">${requestScope.SIGNUP_FAIL}</small>
                        </div>
                        <div class="group">
                            <input style="background-color: #06A3DA;" type="submit" class="button" name="action" value="Login">
                        </div>
                    </form>
                    <div class="hr"></div>
                    <div class="foot-lnk">
                        <a href="#forgot">Forgot Password?</a>
                    </div>
                </div>
                <div class="sign-up-htm">
                    <div class="group">
                        <label for="user" class="label">Full Name</label>
                        <input id="user" type="text" class="input">
                    </div>
                    <div class="group">
                        <label for="pass" class="label">Email Address</label>
                        <input id="pass" type="text" class="input">
                    </div>
                    <div class="group">
                        <label for="pass" class="label">Phone Number</label>
                        <input id="pass" type="text" class="input">
                    </div>
                    <div class="group">
                        <label for="pass" class="label">Password</label>
                        <input id="pass" type="password" class="input" data-type="password">
                    </div>
                    <div class="group">
                        <label for="pass" class="label">Repeat Password</label>
                        <input id="pass" type="password" class="input" data-type="password">
                    </div>
                    <div class="group">
                        <input style="background-color: #06A3DA;" type="submit" class="button" value="Sign Up">
                    </div>
                    <div class="foot-lnk">
                        <label style="cursor: pointer;" for="tab-1">Already Member?</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <a href='#' onclick='login();'>Facebook Login</a>
    <div id="fb-root"></div>
    <script type="text/javascript">
        //<![CDATA[
        window.fbAsyncInit = function () {
            FB.init({
                appId: '275424608482829', // App ID
                channelURL: '', // Channel File, not required so leave empty
                status: true, // check login status
                cookie: true, // enable cookies to allow the server to access the session
                oauth: true, // enable OAuth 2.0
                xfbml: false  // parse XFBML
            });
        };
        // logs the user in the application and facebook
        function login() {
            FB.getLoginStatus(function (r) {
                if (r.status === 'connected') {
                    window.location.href = 'fbconnect.php';
                } else {
                    FB.login(function (response) {
                        if (response.authResponse) {
                            //if (response.perms)
                            window.location.href = 'fbconnect.php';
                        } else {
                            // user is not logged in
                        }
                    }, {scope: 'email'}); // which data to access from user profile
                }
            });
        }
        // Load the SDK Asynchronously
        (function () {
            var e = document.createElement('script');
            e.async = true;
            e.src = document.location.protocol + '//connect.facebook.net/en_US/all.js';
            document.getElementById('fb-root').appendChild(e);
        }());
        //]]>
    </script>



</body>
</html>
