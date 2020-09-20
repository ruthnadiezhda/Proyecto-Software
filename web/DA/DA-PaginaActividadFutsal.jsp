<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Actividad Futsal</title>

  <!-- Custom fonts for this template -->
  <link href="<%=request.getContextPath()%>/bootstrap/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="<%=request.getContextPath()%>/bootstrap/css/sb-admin-2.min.css" rel="stylesheet">

  <!-- Custom styles for this page -->
  <link href="<%=request.getContextPath()%>/bootstrap/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

</head>

<body id="page-top">

  <!-- Page Wrapper -->
  <div id="wrapper">

 <!-- Sidebar -->


    <ul class="navbar-nav bg-gradient-success sidebar sidebar-dark accordion" id="accordionSidebar">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="#">
        <div class="sidebar-brand-icon ">
          <img class="rounded-circle" src="<%=request.getContextPath()%>/bootstrap/img/bat2.jpg" height="65 px" width="76 px">
        </div>
        <div class="sidebar-brand-text mx-3">Vamos Fibra Toxica!</div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

   
      

      <!-- Nav Item - Charts -->
      <li class="nav-item">
       <a class="nav-link" href="<%=request.getContextPath()%>/ParticipanteServlet?type=DA">
          <i class="far fa-calendar-alt"></i>
       <span>Lista de Actividades</span></a>
      </li>



      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages" aria-expanded="true" aria-controls="collapsePages">
          <i class="far fa-calendar-alt"></i>
          <span>Mis Actividades</span>
        </a>
        <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">

          <div class="bg-white py-2 collapse-inner rounded">
            <h6 class="collapse-header">Participo en:</h6>
            <a class="collapse-item" href="#"><i class="fas fa-skating"></i>&nbsp;Baileton</a>
            <a class="collapse-item" href="#"><i class="fas fa-skating"></i>&nbsp;Ajedrez</a>
            <a class="collapse-item" href="DA-PaginaActividadVoley.jsp"><i class="fas fa-skating"></i>&nbsp;Voley</a>

            
          </div>
        </div>
      </li>

<!-- Nav Item - Charts -->
      <li class="nav-item">
        <a class="nav-link" href="DA-PaginaActividadFutsal.jsp">
          <i class="fas fa-edit"></i>
          <span>Ir a Futsal</span></a>
      </li>



      <!-- Nav Item - Charts -->
      <li class="nav-item">
        <a class="nav-link" href="DA-donar.jsp">
          <i class="fas fa-donate"></i>
          <span>Donar</span></a>
      </li>

      <!-- Nav Item - Logout -->
      <li class="nav-item">
        <a class="nav-link" href="G-IniciarSesion.jsp">
          <i class="fas fa-sign-out-alt"></i>
          <span>Logout</span></a>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider d-none d-md-block">

      <!-- Sidebar Toggler (Sidebar) -->
      <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
      </div>

    </ul>


    <!-- Fin de Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">

        <!-- Topbar -->
        <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

          <!-- Sidebar Toggle (Topbar) -->
          <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
            <i class="fa fa-bars"></i>
          </button>

          <!-- Topbar Search -->
          <img src="<%=request.getContextPath()%>/bootstrap/img/esquina.jpg" height="65 px" width="220 px"> </img>

          <!-- Topbar Navbar -->
          <ul class="navbar-nav ml-auto">

          

            <!-- Nav Item - User Information -->
            <li class="nav-item dropdown no-arrow">
              <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <span class="mr-2 d-none d-lg-inline text-gray-600 small">Lewis Rengifo</span>
                <img class="img-profile rounded-circle" src="http://www.iconarchive.com/download/i108973/google/noto-emoji-people-profession/10303-man-office-worker-light-skin-tone.ico">
              </a>
              
            </li>

          </ul>

        </nav>



        <!-- End of Topbar -->

        <!-- Begin Page Content -->
        <div class="container-fluid">

          <!-- Page Heading -->
          <h1 class="h3 mb-2 text-gray-800" align="Center">BIENVENIDO A LA ACTIVIDAD DE FUTSAL, DELEGADO</h1>
          <p class="mb-4">Encuentra los próximos eventos justo aquí!</p>

          <!-- DataTales Example -->
      <div class="row">
      <div class="col-lg-6">
          <div class="card shadow mb-4">
            <div class="card-header py-3">
              <h6 class="m-0 font-weight-bold text-primary">Calendario de Eventos</h6>
            </div>

      
       
            <div class="card-body" >
              <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">            
                  <iframe src="https://calendar.google.com/calendar/embed?height=600&amp;wkst=2&amp;bgcolor=%23039BE5&amp;ctz=America%2FLima&amp;src=YTIwMTY2MjYyQHB1Y3AuZWR1LnBl&amp;src=YWRkcmVzc2Jvb2sjY29udGFjdHNAZ3JvdXAudi5jYWxlbmRhci5nb29nbGUuY29t&amp;src=ZXMucGUjaG9saWRheUBncm91cC52LmNhbGVuZGFyLmdvb2dsZS5jb20&amp;src=ZmlicmEudG94aWNhLnB1Y3BAZ21haWwuY29t&amp;color=%23039BE5&amp;color=%2333B679&amp;color=%230B8043&amp;color=%23B39DDB" style="border-width:0" width="650" height="601" frameborder="0" scrolling="no"></iframe>  
                </table>           
              </div>

            </div>
          </div>
        </div>

    
       <div class="col-lg-6">

              <div class="card shadow mb-4">
                <div class="card-header py-3">
                  <h6 class="m-0 font-weight-bold text-primary">Administracion de Actividad</h6>
                </div>
                <div class="card-body">
                 <div class="p-5"> 
                  <form class="user">
                  <a href="DA-ListaEvento.jsp" class="btn btn-primary btn-block">
                    <span class="icon text-white-50">
                      <i class="fas fa-check"></i>
                    </span>
                    <span class="text">Eventos de la Actividad</span>
                  </a>

                  <div class="my-2"></div>
                  <a href="#" class="btn btn-success btn-block">
                    <span class="icon text-white-50">
                      <i class="fas fa-check"></i>
                    </span>
                    <span class="text">Administrar Actividad</span>
                  </a>
                  <a href="DA-ListaParticipantes.jsp" class="btn btn-info btn-block">
                    <span class="icon text-white-50">
                      <i class="fas fa-check"></i>
                    </span>
                    <span class="text">Ver Lista de Participantes</span>
                  </a>
                </form>
                  </div>
                  
                </div>
              </div>
              <div class="card shadow mb-4">
                <div class="card-header py-3">
                  <h6 class="m-0 font-weight-bold text-primary">Todos juntos por la FIBRA !</h6>
                </div>
                <div class="card-body">
                  <div class="text-center">
                    <img class="img-fluid px-3 px-sm-4 mt-3 mb-4" style="width: 15rem;" src="<%=request.getContextPath()%>/bootstrap/img/voleyfemenino.jpg" >
                    <img class="img-fluid px-3 px-sm-4 mt-3 mb-4" style="width: 17rem;" src="<%=request.getContextPath()%>/bootstrap/img/basquet.jpg" >
                  </div>
                  <p>La Fibra agradece su participación en la actividad de Futsal. Con tu aporte vamos a dejar a la sección de Ingeniería de las Telecomunicaciones en lo mas alto !</p>
                  
                </div>
              </div>

            </div>
      </div>
                
              </div>
            </div>
          </div>

        </div>
        <!-- /.container-fluid -->

      </div>
      <!-- End of Main Content -->

      <!-- Footer -->
      <footer class="sticky-footer bg-white">
        <div class="container my-auto">
          <div class="copyright text-center my-auto">
            <span>Copyright &copy; Your Website 2019</span>
          </div>
        </div>
      </footer>
      <!-- End of Footer -->

    </div>
    <!-- End of Content Wrapper -->

  </div>
  <!-- End of Page Wrapper -->

  <!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Logout Modal-->
  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
          </button>
        </div>
        <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
        <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
          <a class="btn btn-primary" href="login.jsp">Logout</a>
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

  <!-- Page level plugins -->
  <script src="<%=request.getContextPath()%>/bootstrap/vendor/datatables/jquery.dataTables.min.js"></script>
  <script src="<%=request.getContextPath()%>/bootstrap/vendor/datatables/dataTables.bootstrap4.min.js"></script>

  <!-- Page level custom scripts -->
  <script src="<%=request.getContextPath()%>/bootstrap/js/demo/datatables-demo.js"></script>

</body>

</html>