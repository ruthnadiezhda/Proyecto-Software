<%-- 
    Document   : G-RecuperarContraseña
    Created on : 10/11/2019, 05:49:47 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Email.Email"%>

<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Recupera contraseña</title>

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

      <div class="col-xl-10 col-lg-12 col-md-9">

        <div class="card o-hidden border-0 shadow-lg my-5">
          <div class="card-body p-0">
            <!-- Nested Row within Card Body -->
            <div class="row">
              <img class="col-lg-6"  src="<%=request.getContextPath()%>/bootstrap/img/fibratox.jpg"></img>
              <div class="col-lg-6">
                <div class="p-5">
                  <div class="text-center">
                    <h1 class="h4 text-gray-900 mb-2">Recupera contraseña</h1>
                    <p class="mb-4">Por favor ingrese su correo PUCP. Si existe una cuenta asociada al correo que ingrese se le enviará un enlace para recuperar su contraseña. </p>
                  </div>
                    <form method="POST" action="<%= request.getContextPath()%>/ParticipanteServlet?accion=recuperacontraseñaRuth">
                    <div class="form-group">
                      <input type="email" class="form-control form-control-user" name="correo" id="exampleInputEmail" aria-describedby="emailHelp" placeholder="Ingrese su correo PUCP...">
                      
                    </div>
                      <button type="submit" class="btn btn-dark btn-user btn-block">
                      Enviar correo 
                    </button>
                  </form>
                  <hr>
                  <div class="text-center" >
                    <a class="small" href="<%=request.getContextPath()%>/General/G-RegistroSemana.jsp"><font color="gray">Crea una cuenta</font></a>
                  </div>
                  <div class="text-center">
                    <a class="small" href="<%=request.getContextPath()%>/General/G-IniciarSesion.jsp"><font color="gray">Ya tienes una cuenta? Ingresa!</font></a>
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

