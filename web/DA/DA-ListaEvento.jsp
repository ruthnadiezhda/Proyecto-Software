<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Lista de Eventos </title>

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
          <h1 class="h1 mb-2 text-gray-800">Lista de Eventos de Futsal</h1>
          <p class="mb-4">Aqui puede ver la lista de eventos de Futsal.</p>

          <!-- DataTales Example -->
          <div class="card shadow mb-4">
            <div class="card-header py-3">
              <h4 class="m-0 font-weight-bold text-primary">Futsal</h4>
            </div>
            <div class="card-body">
              <div class="table-responsive">
                <table class="table table-bordered table-hover" id="dataTable" width="100%" cellspacing="">
                  <thead>
                    <tr>

                      <th>Nombre del Eventos</th>
                      <th>Hora</th>
                      <th>Lugar</th>
                      <th>Cantidad de Inscritos</th>
                      <th>Fecha</th>
                      <th>Descripción del evento</th>
                      <th>Modificar o Eliminar</th>
                    </tr>
                  </thead>
                  <tfoot>
                    <tr>
                      <th>Nombre del Eventos</th>
                      <th>Fecha</th>
                      <th>Hora</th>
                      <th>Lugar</th>
                      <th>Cantidad de Inscritos</th>
                      <th>Descripción del evento</th>
                      <th>Modificar o Eliminar</th>
                    </tr>
                  </tfoot>
                  <tbody>
                    <tr>
                      <td>Partido de practica 1</td>
                      <td>15:45</td>
                      <td>Cancha de Minas</td>
                      <td>13</td>
                      <td>25/04/2019</td>
                      <th>Es el primer partido de practica para elegir nuestros participantes en Futsal. Ven y participa! Te esperamos.</th>
                      <td> <a href="DA-ModificarEvento.jsp" class="btn btn-info btn-circle btn-circle"> <i class="fas fa-edit"></i></i> </a>  <a href="DA-ListaEvento.jsp" class="btn btn-danger btn-circle"> <i class="fas fa-trash"></i></a></td>
                    </tr>
                    <tr>
                      <td>Partido de practica 2</td>
                      <td>15:45</td>
                      <td>Cancha de Minas</td>
                      <td>5</td>
                      <td>30/05/2019</td>
                     <th>Es el segundo partido de practica para elegir nuestros participantes en Futsal. Ven y participa! Te esperamos.</th>
                      <td> <a href="DA-ModificarEvento.jsp" class="btn btn-info btn-circle btn-circle"> <i class="fas fa-edit"></i></i> </a>  <a href="DA-ListaEvento.jsp" class="btn btn-danger btn-circle"> <i class="fas fa-trash"></i></a></td>
                    </tr>
                    <tr>
                      <td>Partido de practica 3</td>
                      <td>15:20</td>
                      <td>Cancha de Minas</td>
                      <td>2</td>
                      <td>30/06/2019</td>
                      <th>Es el tercer partido de practica para elegir nuestros participantes en Futsal. Ven y participa! Te esperamos.</th>
                      <td> <a href="DA-ModificarEvento.jsp" class="btn btn-info btn-circle btn-circle"> <i class="fas fa-edit"></i></i> </a>  <a href="DA-ListaEvento.jsp" class="btn btn-danger btn-circle"> <i class="fas fa-trash"></i></a></td>
                    </tr>
                    
                  </tbody>
                </table>
              </div>
            </div>

            <div style="margin-left: auto;">
              <a href="DA-CrearEvento.jsp" class="btn bg-success btn-icon-split">
                    <span class="icon text-light" > <i class="fas fa-arrow-right"></i> </span><span class="text text-light">Añadir un Evento</span></a>
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
            <span><i class="fas fa-terminal"></i> Sudo ponganos 20 </span>
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
