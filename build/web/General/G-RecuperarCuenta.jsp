<%-- 
    Document   : G-RecuperarCuenta
    Created on : 10/11/2019, 05:50:03 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String mss = (String) request.getAttribute("mss");
%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>RecuperacionCuenta</title>

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
              <img class="col-lg-6" src="<%=request.getContextPath()%>/bootstrap/img/fibratox.jpg"></img>
              <div class="col-lg-6">
                <div class="p-5">
                  <div class="text-center">
                    <h1 class="h4 text-gray-900 mb-2">Recuperacion de Cuenta</h1>
                    <p class="mb-4">Usted ha solicitado recuperar su cuenta de la Fibra. Ingrese su nueva contraseña</p>
                  </div>
                  <form method="POST" action="<%= request.getContextPath()%>/ParticipanteServlet?accion=recuperar&hash=">
                    <div class="form-group">
                      <input type="password" name="pass1" class="form-control form-control-user" id="password1" aria-describedby="constrasenha" placeholder="Asegurese de que sea segura...">
                    </div>
                    <div class="form-group">
                      <input type="password" name="pass2" class="form-control form-control-user" id="password2" aria-describedby="constrasenha1" placeholder="Repita la contraseña">
                    </div>
                    <div class="text-center text-danger font-weight-bolder	">
                        <%if (mss != null) { %>
                          oe ctmr pon bien tu mrd
                        <% }else {%>
                            por fin te hiciste una
                        <% }%>
                    </div>
                    <button  type="submit" class="btn btn-dark btn-user btn-block">
                      <font color="white">Recuperar!</font>
                    </button>
                  </form>
                  <hr>
                  
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

