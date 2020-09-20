<%-- 
    Document   : Participante-ListaActividades
    Created on : 10/11/2019, 05:50:49 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Beans.Participante"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Beans.Actividad"%>
<jsp:useBean type="ArrayList<Actividad>" scope="request" id="lista" />
<% Participante participante = new Participante();
    participante.setNombre("Sergio");
    participante.setApellido("Muro"); %>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Lista Actividades Disponibles</title>

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


            <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

                <!-- Sidebar - Brand -->
                <a class="sidebar-brand d-flex align-items-center justify-content-center" href="<%=request.getContextPath()%>/ParticipanteServlet?type=PA">
                    <div class="sidebar-brand-icon ">
                        <img class="rounded-circle" src="<%=request.getContextPath()%>/bootstrap/img/bat2.jpg" height="65 px" width="76 px">
                    </div>
                    <div class="sidebar-brand-text mx-3">Vamos Fibra Toxica!</div>
                </a>

                <!-- Divider -->
                <hr class="sidebar-divider my-0">

                <!-- Nav Item - Dashboard -->




                <!-- Heading -->




                <!-- Heading -->


                <!-- Nav Item - Charts -->
                <li class="nav-item">
                    <a class="nav-link" href="<%=request.getContextPath()%>/ParticipanteServlet?type=Participante">
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
                            <h6 class="collapse-header">Participas en:</h6>
                            <a class="collapse-item" href="#"><i class="fas fa-skating"></i>&nbsp;Baileton</a>
                            <a class="collapse-item" href="#"><i class="fas fa-skating"></i>&nbsp;Futsal</a>
                            <a class="collapse-item" href="Participante-PaginaActividadVoley.jsp"><i class="fas fa-skating"></i>&nbsp;Voley</a>


                        </div>
                    </div>
                </li>

                <!-- Nav Item - Charts -->
                <li class="nav-item">
                    <a class="nav-link" href="Participante-Donar.jsp">
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
                                    <span class="mr-2 d-none d-lg-inline text-gray-600 small"> <%= participante.getNombre()%> <%= participante.getApellido()%>   </span>
                                    <img class="img-profile rounded-circle" src="http://www.iconarchive.com/download/i108973/google/noto-emoji-people-profession/10303-man-office-worker-light-skin-tone.ico">
                                </a>

                            </li>

                        </ul>

                    </nav>


                    <!-- End of Topbar -->












                    <!-- Begin Page Content -->
                    <div class="container-fluid">

                        <!-- Page Heading -->
                        <h1 class="h3 mb-2 text-grey-700" align="Center">Lista de actividades disponibles</h1>
                        <p class="mb-4">A continuación se muestran las actividades disponibles de Semana de Ingeniería 2019 </p>

                        <!-- DataTales Example -->
                        <div class="card shadow mb-4">
                            <div class="card-header py-3">
                                <h6 class="m-0 font-weight-bold text-primary">FIBRA TOXICA</h6>
                            </div>
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                        <thead>
                                            <tr>
                                                <th>ID de la actividad</th>
                                                <th>Nombre de la actividad</th>
                                                <th>Descripción</th>
                                                <th>Nombre del Delegado</th>                    
                                            </tr>
                                        </thead>
                                        <tfoot>
                                            <tr>
                                                <th>ID de la actividad</th>
                                                <th>Nombre de la actividad</th>
                                                <th>Descripción</th>
                                                <th>Nombre del Delegado</th>                    
                                            </tr>
                                        </tfoot>
                                        <tbody>
                                        <% for (Actividad actividad : lista) {%>
                                        <tr>
                                          <td><%=actividad.getIdActividad()%></td>
                                          <td><%=actividad.getNombre()%></td>
                                          <td><%=actividad.getDescripcion()%></td>
                                          <td><%=actividad.getDelegado()%></td>
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
