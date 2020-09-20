package org.apache.jsp.Participante;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Participante_002dPaginaActividadVoley_002dSamuel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("  <title>Actividad Futsal Damas</title>\n");
      out.write("\n");
      out.write("  <!-- Custom fonts for this template -->\n");
      out.write("  <link href=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Custom styles for this template -->\n");
      out.write("  <link href=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/css/sb-admin-2.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Custom styles for this page -->\n");
      out.write("  <link href=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/vendor/datatables/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("\n");
      out.write("  <!-- Page Wrapper -->\n");
      out.write("  <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("     <!-- Sidebar -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\n");
      out.write("\n");
      out.write("      <!-- Sidebar - Brand -->\n");
      out.write("      <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"");
      out.print(request.getContextPath());
      out.write("/ParticipanteServlet?type=PA\">\n");
      out.write("        <div class=\"sidebar-brand-icon \">\n");
      out.write("          <img class=\"rounded-circle\" src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/img/bat2.jpg\" height=\"65 px\" width=\"76 px\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-brand-text mx-3\">Vamos Fibra Toxica!</div>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <!-- Divider -->\n");
      out.write("      <hr class=\"sidebar-divider my-0\">\n");
      out.write("\n");
      out.write("      <!-- Nav Item - Dashboard -->\n");
      out.write("      \n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("      <!-- Heading -->\n");
      out.write("      \n");
      out.write("      \n");
      out.write("\n");
      out.write("      \n");
      out.write("      <!-- Heading -->\n");
      out.write("      \n");
      out.write("\n");
      out.write("      <!-- Nav Item - Charts -->\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("       <a class=\"nav-link\" href=\"Participante-ListaActividades.jsp\">\n");
      out.write("          <i class=\"far fa-calendar-alt\"></i>\n");
      out.write("       <span>Lista de Actividades</span></a>\n");
      out.write("      </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <!-- Nav Item - Pages Collapse Menu -->\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapsePages\" aria-expanded=\"true\" aria-controls=\"collapsePages\">\n");
      out.write("          <i class=\"far fa-calendar-alt\"></i>\n");
      out.write("          <span>Mis Actividades</span>\n");
      out.write("        </a>\n");
      out.write("        <div id=\"collapsePages\" class=\"collapse show\" aria-labelledby=\"headingPages\" data-parent=\"#accordionSidebar\" style=\"\">\n");
      out.write("\n");
      out.write("          <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("            <h6 class=\"collapse-header\">Participas en:</h6>\n");
      out.write("            <a class=\"collapse-item\" href=\"#\"><i class=\"fas fa-skating\"></i>&nbsp;Baileton</a>\n");
      out.write("            <a class=\"collapse-item\" href=\"#\"><i class=\"fas fa-skating\"></i>&nbsp;Futsal</a>\n");
      out.write("            <a class=\"collapse-item\" href=\"Participante-PaginaActividadVoley.jsp\"><i class=\"fas fa-skating\"></i>&nbsp;Voley</a>\n");
      out.write("\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      <!-- Nav Item - Charts -->\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"Participante-Donar.jsp\">\n");
      out.write("          <i class=\"fas fa-donate\"></i>\n");
      out.write("          <span>Donar</span></a>\n");
      out.write("      </li>\n");
      out.write("\n");
      out.write("      <!-- Nav Item - Logout -->\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"G-IniciarSesion.jsp\">\n");
      out.write("          <i class=\"fas fa-sign-out-alt\"></i>\n");
      out.write("          <span>Logout</span></a>\n");
      out.write("      </li>\n");
      out.write("\n");
      out.write("      <!-- Divider -->\n");
      out.write("      <hr class=\"sidebar-divider d-none d-md-block\">\n");
      out.write("\n");
      out.write("      <!-- Sidebar Toggler (Sidebar) -->\n");
      out.write("      <div class=\"text-center d-none d-md-inline\">\n");
      out.write("        <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Fin de Sidebar -->\n");
      out.write("\n");
      out.write("    <!-- Content Wrapper -->\n");
      out.write("    <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("      <!-- Main Content -->\n");
      out.write("      <div id=\"content\">\n");
      out.write("\n");
      out.write("        <!-- Topbar -->\n");
      out.write("        <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\n");
      out.write("\n");
      out.write("          <!-- Sidebar Toggle (Topbar) -->\n");
      out.write("          <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\n");
      out.write("            <i class=\"fa fa-bars\"></i>\n");
      out.write("          </button>\n");
      out.write("\n");
      out.write("          <!-- Topbar Search -->\n");
      out.write("          <img src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/img/esquina.jpg\" height=\"65 px\" width=\"220 px\"> </img>\n");
      out.write("\n");
      out.write("          <!-- Topbar Navbar -->\n");
      out.write("          <ul class=\"navbar-nav ml-auto\">\n");
      out.write("\n");
      out.write("          \n");
      out.write("\n");
      out.write("            <!-- Nav Item - User Information -->\n");
      out.write("            <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">Carlos Minaya</span>\n");
      out.write("                <img class=\"img-profile rounded-circle\" src=\"http://www.iconarchive.com/download/i108973/google/noto-emoji-people-profession/10303-man-office-worker-light-skin-tone.ico\">\n");
      out.write("              </a>\n");
      out.write("              \n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("          </ul>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- End of Topbar -->\n");
      out.write("\n");
      out.write("        <!-- Begin Page Content -->\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("          <!-- Page Heading -->\n");
      out.write("          <h1 class=\"h3 mb-2 text-gray-800\" align=\"Center\">BIENVENIDO A LA ACTIVIDAD DE FUTSAL DAMAS</h1>\n");
      out.write("          <p class=\"mb-4\">Encuentra los próximos eventos que organiza tu delegado justo aquí !</p>\n");
      out.write("\n");
      out.write("          <!-- DataTales Example -->\n");
      out.write("      <div class=\"row\">\n");
      out.write("      <div class=\"col-lg-6\">\n");
      out.write("          <div class=\"card shadow mb-4\">\n");
      out.write("            <div class=\"card-header py-3\">\n");
      out.write("              <h6 class=\"m-0 font-weight-bold text-primary\">Calendario de Eventos</h6>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("      \n");
      out.write("       \n");
      out.write("            <div class=\"card-body\" >\n");
      out.write("              <div class=\"table-responsive\">\n");
      out.write("                <table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\">            \n");
      out.write("                  <iframe src=\"https://calendar.google.com/calendar/embed?height=600&amp;wkst=2&amp;bgcolor=%23039BE5&amp;ctz=America%2FLima&amp;src=YTIwMTY2MjYyQHB1Y3AuZWR1LnBl&amp;src=YWRkcmVzc2Jvb2sjY29udGFjdHNAZ3JvdXAudi5jYWxlbmRhci5nb29nbGUuY29t&amp;src=ZXMucGUjaG9saWRheUBncm91cC52LmNhbGVuZGFyLmdvb2dsZS5jb20&amp;src=ZmlicmEudG94aWNhLnB1Y3BAZ21haWwuY29t&amp;color=%23039BE5&amp;color=%2333B679&amp;color=%230B8043&amp;color=%23B39DDB\" style=\"border-width:0\" width=\"620\" height=\"502\" frameborder=\"0\" scrolling=\"no\"></iframe>  \n");
      out.write("                </table>           \n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("       <div class=\"col-lg-6\">\n");
      out.write("\n");
      out.write("              <div class=\"card shadow mb-4\">\n");
      out.write("                <div class=\"card-header py-3\">\n");
      out.write("                  <h6 class=\"m-0 font-weight-bold text-primary\">¿Deseas apoyar a la Fibra?</h6>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                 <div class=\"p-5\"> \n");
      out.write("                  <form class=\"user\">\n");
      out.write("                  \n");
      out.write("\n");
      out.write("                  <div class=\"my-2\"></div>                \n");
      out.write("                  \n");
      out.write("\n");
      out.write("                  <button style=\"margin:7px 15px 17px 0;\" type=\"button\" class=\"btn btn-success btn-lg btn-block \" data-toggle=\"modal\" data-target=\"#myModal\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\"><span class=\"icon text-white-50\">\n");
      out.write("                          <i class=\"fas fa-check\"></i>\n");
      out.write("                        </span>Inscribirse a actividad</font></font></button>\n");
      out.write("                  <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\" style=\"display: none;\">\n");
      out.write("                    <div class=\"modal-dialog modal-lg\">\n");
      out.write("                      <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                          <h4 class=\"modal-title\" id=\"myModalLabel\"><font style=\"align-content: center;\"><font style=\"vertical-align: initial;\">Gracias por el apoyo a la Fibra !</font></font></h4>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Cerrar\"><span aria-hidden=\"true\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">x</font></font></span></button>\n");
      out.write("          \n");
      out.write("                        </div>\n");
      out.write("                          <div class=\"modal-body\">\n");
      out.write("                            <p><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">Usted se ha inscrito para que sea parte de esta actividad.</font></font></p>\n");
      out.write("                          </div>\n");
      out.write("                        <div class=\"modal-footer\"  >\n");
      out.write("                          <button type=\"button\"  class=\"btn btn-default\" data-dismiss=\"modal\" ><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">Cerrar</font></font></button>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("                  </div>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card shadow mb-4\">\n");
      out.write("                <div class=\"card-header py-3\">\n");
      out.write("                  <h6 class=\"m-0 font-weight-bold text-primary\">Todos juntos por la FIBRA !</h6>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <div class=\"text-center\">\n");
      out.write("                    <img class=\"img-fluid px-3 px-sm-4 mt-3 mb-4\" style=\"width: 15rem;\" src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/img/voleyfemenino.jpg\" >\n");
      out.write("                    <img class=\"img-fluid px-3 px-sm-4 mt-3 mb-4\" style=\"width: 17rem;\" src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/img/basquet.jpg\" >\n");
      out.write("                  </div>\n");
      out.write("                  <p>Participa de esta Semana de Ingeniería apoyando a la Fibra ! #15 años de pasión</p>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("      </div>\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <!-- End of Main Content -->\n");
      out.write("\n");
      out.write("      <!-- Footer -->\n");
      out.write("      <footer class=\"sticky-footer bg-white\">\n");
      out.write("        <div class=\"container my-auto\">\n");
      out.write("          <div class=\"copyright text-center my-auto\">\n");
      out.write("            <span>Copyright &copy; Your Website 2019</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </footer>\n");
      out.write("      <!-- End of Footer -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- End of Content Wrapper -->\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  <!-- End of Page Wrapper -->\n");
      out.write("\n");
      out.write("  <!-- Scroll to Top Button-->\n");
      out.write("  <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("    <i class=\"fas fa-angle-up\"></i>\n");
      out.write("  </a>\n");
      out.write("\n");
      out.write("  <!-- Logout Modal-->\n");
      out.write("  <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("          <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("            <span aria-hidden=\"true\">×</span>\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("          <a class=\"btn btn-primary\" href=\"login.jsp\">Logout</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Bootstrap core JavaScript-->\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Core plugin JavaScript-->\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Custom scripts for all pages-->\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/js/sb-admin-2.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Page level plugins -->\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/vendor/datatables/jquery.dataTables.min.js\"></script>\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/vendor/datatables/dataTables.bootstrap4.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Page level custom scripts -->\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/js/demo/datatables-demo.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
