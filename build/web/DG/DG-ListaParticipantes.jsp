<%@page import="Beans.Participante"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean type="ArrayList<Participante>" scope="request" id="lista" />
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Lista de Participantes</title>

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


    <ul class="navbar-nav bg-gradient-danger sidebar sidebar-dark accordion" id="accordionSidebar">

      <!-- Sidebar - Brand -->
        <a class="sidebar-brand d-flex align-items-center justify-content-center" href="#">
        <div class="sidebar-brand-icon ">
          <img class="rounded-circle" src="<%=request.getContextPath()%>/bootstrap/img/bat2.jpg" height="65 px" width="76 px">
        </div>
        <div class="sidebar-brand-text mx-3">Vamos Fibra Toxica! </div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

   
      

      <!-- Nav Item - Charts -->
      <li class="nav-item">
       <a class="nav-link" href="<%=request.getContextPath()%>/ActividadServlet?type=DG">
          <i class="far fa-calendar-alt"></i>
       <span>Lista de Actividades</span></a>
      </li>



      <!-- Nav Item - Pages Collapse Menu -->
      
<!-- start  Solicitudes-->
<li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseSolicitudes" aria-expanded="true" aria-controls="collapsePages">
          <i class="fas fa-user-edit"></i>
          <span>Solicitudes</span>
        </a>
        <div id="collapseSolicitudes" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">

          <div class="bg-white py-2 collapse-inner rounded">
            <h6 class="collapse-header">Lista de Solicitudes:</h6>
            <a class="collapse-item" href="<%=request.getContextPath()%>/ParticipanteServlet?accion=listarNoAceptados"><i class="fas fa-clipboard-check"></i>&nbsp;Solicitudes de Registro</a>
            <a class="collapse-item" href="<%=request.getContextPath()%>/ActividadServlet?accion=listarsolicitudesdelegado"><i class="fas fa-clipboard-check"></i>&nbsp;Solicitudes de Delegado</a>
            <a class="collapse-item" href="<%=request.getContextPath()%>/DonacionServlet?accion=listar"><i class="fas fa-clipboard-check"></i>&nbsp;Solicitudes de <br> &nbsp;&nbsp;&nbsp;&nbsp;Donaciones</a>

            
          </div>
        </div>
      </li>

<!-- end Solicitudes--> 


<!-- start  lista de participantes-->
<li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseParticipantes" aria-expanded="true" aria-controls="collapseParticipantes">
          <i class="fas fa-users"></i>
          <span>Participantes</span>
        </a>
        <div id="collapseParticipantes" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">

          <div class="bg-white py-2 collapse-inner rounded">
            <h6  class="collapse-header" > Lista de Participantes:</h6> 
            <a class="collapse-item" href="DG-ListaDelegados.jsp"><i class="fas fa-list-alt"></i> &nbsp;Lista de Delegados</a>
            <a class="collapse-item" href="<%=request.getContextPath()%>/ParticipanteServlet?accion=listarAceptados"><i class="fas fa-list-alt"></i> &nbsp;Lista de Participantes</a>

            
          </div>
        </div>
      </li>

<!-- end lista de participantes--> 






      <!-- Nav Item - Charts -->
      <li class="nav-item">
        <a class="nav-link" href="DG-Estadisticas.jsp">
          <i class="fas fa-fw fa-chart-area"></i>
          <span>Estadisticas</span></a>
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


    <!-- wait de Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">

        <!-- Topbar -->
        <nav class="navbar navbar-expand navbar-light bg-light topbar mb-4 static-top shadow">

          <!-- Sidebar Toggle (Topbar) -->
          <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
            <i class="fa fa-bars"></i>
          </button>

          <!-- Topbar Search -->
          <img src="<%=request.getContextPath()%>/bootstrap/img/esquina.png" height="65 px" width="220 px"> </img>

          <!-- Topbar Navbar -->
          <ul class="navbar-nav ml-auto">

          

            <!-- Nav Item - User Information -->
            <li class="nav-item dropdown no-arrow">
              <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <span class="mr-2 d-none d-lg-inline text-danger small">Sergio Muro</span>
                <img class=" rounded-circle" src="<%=request.getContextPath()%>/bootstrap/img/sergiomuro2.jpg" height="67 px" width="70 px ">
              </a>
              
            </li>

          </ul>

        </nav>



        <!-- End of Topbar -->

        <!-- Begin Page Content -->
        <div class="container-fluid">

          <!-- Page Heading -->
          <h1 class="h3 mb-2 text-gray-800">Lista de Alumnos y Egresados Inscritos en Semana</h1>
          <hr></hr>


          <!-- DataTales Example -->
          <div class="card shadow mb-4">
            <div class="card-header py-3">
              <h6 class="m-0 font-weight-bold text-primary">Participantes</h6>

            </div>
            <div class="card-body">
              <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                  <thead>
                    <tr>
                      <th>Nombre y Apellidos</th>
                      <th>Código PUCP</th>
                      <th>Número de Actividades</th>
                      <th>Condición</th>
                      <th>Cantidad Donada</th>
                      <th>Eliminar o Bannear</th>
                    </tr>
                  </thead>
                  <tfoot>
                    <tr>
                      <th>Nombre y Apellidos</th>
                      <th>Código PUCP</th>
                      <th>Número de Actividades</th>
                      <th>Condición</th>
                      <th>Cantidad Donada</th>
                      <th>Eliminar o Bannear</th>
                    </tr>
                  </tfoot>
                  <tbody>
                      <% for(Participante p : lista){ %>
                    <tr>
                      <td><%=p.getNombre() +" " + p.getApellido() %></td>
                      <td><%=p.getCodigo() %></td>
                      <td>esta en desarrollo</td>
                      <%  if(p.getFacultad() == null){
                          %>    <td>Egresado</td> <%          
                      }else{
                          %>    <td>Alumno</td> <%
                      }%>  
                      <td>esta en desarrollo</td>
                      <td> <a href="ParticipanteServlet?accion=eliminarParticipante&id=<%=p.getIdParticipante()%>" class="btn btn-warning btn-circle btn-circle">  <i class="fas fa-trash"></i> </a>  <a href="ParticipanteServlet?accion=bannearParticipante&id=<%=p.getIdParticipante()%>" class="btn btn-danger btn-circle"> <i class="fas fa-user-slash"></i></a></td>
                    </tr>
                    <% }%>
                        
                  </tbody>
                </table>
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
