<%-- 
    Document   : G-IniciarSesion
    Created on : 10/11/2019, 05:49:25 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Iniciar Sesión</title>

        <!-- Custom fonts for this template-->
        <link href="<%=request.getContextPath()%>/bootstrap/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

        <!-- Custom styles for this template-->
        <link href="<%=request.getContextPath()%>/bootstrap/css/sb-admin-2.min.css" rel="stylesheet">






    </head>

    <body class="bg-gradient-dark">

        <div class="container">

            <!-- Outer Row -->
            <div class="row justify-content-center">

                <div class="col-xl-10 col-lg-12 col-md-9 ">

                    <div class="card o-hidden border-0 shadow-lg my-5">
                        <div class="card-body p-0">
                            <!-- Nested Row within Card Body -->
                            <div class="row"> 

                                <img class="col-lg-6"  src="<%=request.getContextPath()%>/bootstrap/img/fibratox.jpg"></img>
                                <div class="col-lg-6">
                                    <div class="p-5">
                                        <div class="text-center">
                                            <h1 class="h4 text-gray-900 mb-4">¡Bienvenido Teleco!
                                           </h1>
                                            <h1>
                                                
                                            </h1>
                                        </div>
                                        <form class="user" method="POST" action="<%=request.getContextPath()%>/LoginServlet?accion=validar">
                                            <div class="form-group">
                                                <input type="email" name="usuario" class="form-control form-control-user" id="usuario" aria-describedby="emailHelp" placeholder="Ingresa tu correo PUCP">
                                            </div>
                                            <div class="form-group">
                                                <input type="password" class="form-control form-control-user" id="clave" name="clave" placeholder="Contraseña">
                                            </div>

                                            <input type="submit" value="Iniciar Sesion" class="btn btn-dark btn-user btn-block" />


                                        </form>
                                        <div class="text-center text-danger font-weight-bolder	">
                                            <%if (request.getAttribute("msg_error") != null) { %>
                                            Error en el usuario o contraseña ingresado.
                                            <% }else {%>
                                            Bien
                                            <% }%></div>
                                        <hr>
                                        <div class="text-center">
                                            <a class="small ga" href="<%=request.getContextPath()%>/General/G-RecuperarContraseña.jsp"><font color="gray">¿Olvidaste tu contraseña?</font></a>
                                        </div>
                                        <div class="text-center">
                                            <a class="small ga" href="<%=request.getContextPath()%>/General/G-RegistroSemana.jsp"><font color="gray">Registrarse</font></a>
                                        </div>



                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>

            </div>

        </div> 

        <!-- Bootstrap core JavaScript-->
        <script src="<%=request.getContextPath()%>/bootstrap/vendor/jquery/jquery.min.js"></script>
        <script src="<%=request.getContextPath()%>/bootstrap/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="<%=request.getContextPath()%>/bootstrap/vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="<%=request.getContextPath()%>/bootstrap/js/sb-admin-2.min.js"></script>

    </body>

</html>

