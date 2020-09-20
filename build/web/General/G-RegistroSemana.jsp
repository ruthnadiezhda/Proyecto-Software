<%-- 
    Document   : G-RegistroSemana
    Created on : 10/11/2019, 05:14:33 PM
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

        <title>RegistroSemana</title>

        <!-- Custom fonts for this template-->
        <link href="<%=request.getContextPath()%>/bootstrap/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

        <!-- Custom styles for this template-->
        <link href="<%=request.getContextPath()%>/bootstrap/css/sb-admin-2.min.css" rel="stylesheet">

    </head>

    <body class="bg-gradient-dark">

        <div class="container">

            <div class="card o-hidden border-0 shadow-lg my-5">
                <div class="card-body p-0">
                    <!-- Nested Row within Card Body -->
                    <div class="row">
                        <img class="col-lg-6" src="<%=request.getContextPath()%>/bootstrap/img/fibratox.jpg""></img>
                        <div class="col-lg-6">
                            <div class="p-5">
                                <div class="text-center">
                                    <h1 class="h4 text-gray-900 mb-4">¡Animate y Registrate!</h1>
                                </div>



                                <form method="POST" action="../ParticipanteServlet?accion=registrarParticipante" class="user">
                                    <div class="form-group row">
                                        <div class="col-sm-6 mb-3 mb-sm-0">
                                            <input type="text" class="form-control form-control-user" id="exampleFirstName" placeholder="Nombre" name="nombre">
                                        </div>
                                        <div class="col-sm-6">
                                            <input type="text" class="form-control form-control-user" id="exampleLastName" placeholder="Apellidos" name="apellido">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <input type="email" class="form-control form-control-user" id="exampleInputEmail" placeholder="Correo PUCP" name="correo">
                                    </div>
                                    <div class="form-group row">
                                        <div class="col-sm-4 mb-3 mb-sm-0">
                                            <input type="text" class="form-control form-control-user" id="exampleFirstName" placeholder="Codigo PUCP" name="codigo">
                                        </div>
                                        <div class="col-sm-8">
                                            <select class="form-control" id="sel1" name="egresado">
                                                <option value="falsefacu">Alumno FACULTAD</option>
                                                <option value="true">Egresado</option>
                                                <option value="falseeeggcc">Alumno EEGGCC</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <div class="col-sm-6 mb-3 mb-sm-0 form-group" >
                                            <input type="password" class="form-control form-control-user" id="exampleInputPassword" placeholder="Clave" name="constrasenha">
                                        </div>
                                        <div class="col-sm-6">
                                            <input type="password" class="form-control form-control-user" id="exampleRepeatPassword" placeholder="Repita la clave" name="contra">
                                        </div>
                                    </div>
                                    <button type="Submit"  class="btn btn-dark btn-user btn-block">
                                        Registrar
                                    </button>
                                    <hr>
                                </form>




                                <hr>

                                <div class="text-center">
                                    <a class="small" href="G-IniciarSesion.jsp"><font color="gray">Ya estas registrado? Inicia sesión! </font></a>
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


