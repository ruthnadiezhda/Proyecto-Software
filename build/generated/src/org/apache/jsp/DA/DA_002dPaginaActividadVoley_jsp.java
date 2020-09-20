package org.apache.jsp.DA;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DA_002dPaginaActividadVoley_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("  <meta name=\"description\" content=\"\">\r\n");
      out.write("  <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("  <title>Voley</title>\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom fonts for this template -->\r\n");
      out.write("  <link href=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom styles for this template -->\r\n");
      out.write("  <link href=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom styles for this page -->\r\n");
      out.write("  <link href=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/vendor/datatables/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"page-top\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Page Wrapper -->\r\n");
      out.write("  <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write(" <!-- Sidebar -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <ul class=\"navbar-nav bg-gradient-success sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Sidebar - Brand -->\r\n");
      out.write("      <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"#\">\r\n");
      out.write("        <div class=\"sidebar-brand-icon \">\r\n");
      out.write("          <img class=\"rounded-circle\" src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/img/bat2.jpg\" height=\"65 px\" width=\"76 px\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"sidebar-brand-text mx-3\">Vamos Fibra Toxica!</div>\r\n");
      out.write("      </a>\r\n");
      out.write("\r\n");
      out.write("      <!-- Divider -->\r\n");
      out.write("      <hr class=\"sidebar-divider my-0\">\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("      <!-- Nav Item - Charts -->\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("       <a class=\"nav-link\" href=\"");
      out.print(request.getContextPath());
      out.write("/ParticipanteServlet?type=DA\">\r\n");
      out.write("          <i class=\"far fa-calendar-alt\"></i>\r\n");
      out.write("       <span>Lista de Actividades</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <!-- Nav Item - Pages Collapse Menu -->\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapsePages\" aria-expanded=\"true\" aria-controls=\"collapsePages\">\r\n");
      out.write("          <i class=\"far fa-calendar-alt\"></i>\r\n");
      out.write("          <span>Mis Actividades</span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <div id=\"collapsePages\" class=\"collapse\" aria-labelledby=\"headingPages\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("\r\n");
      out.write("          <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("            <h6 class=\"collapse-header\">Participo en:</h6>\r\n");
      out.write("            <a class=\"collapse-item\" href=\"#\"><i class=\"fas fa-skating\"></i>&nbsp;Baileton</a>\r\n");
      out.write("            <a class=\"collapse-item\" href=\"#\"><i class=\"fas fa-skating\"></i>&nbsp;Ajedrez</a>\r\n");
      out.write("            <a class=\"collapse-item\" href=\"DA-PaginaActividadVoley.jsp\"><i class=\"fas fa-skating\"></i>&nbsp;Voley</a>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("\r\n");
      out.write("<!-- Nav Item - Charts -->\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"DA-PaginaActividadFutsal.jsp\">\r\n");
      out.write("          <i class=\"fas fa-edit\"></i>\r\n");
      out.write("          <span>Ir a Futsal</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <!-- Nav Item - Charts -->\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"DA-donar.jsp\">\r\n");
      out.write("          <i class=\"fas fa-donate\"></i>\r\n");
      out.write("          <span>Donar</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("\r\n");
      out.write("      <!-- Nav Item - Logout -->\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"G-IniciarSesion.jsp\">\r\n");
      out.write("          <i class=\"fas fa-sign-out-alt\"></i>\r\n");
      out.write("          <span>Logout</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("\r\n");
      out.write("      <!-- Divider -->\r\n");
      out.write("      <hr class=\"sidebar-divider d-none d-md-block\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Sidebar Toggler (Sidebar) -->\r\n");
      out.write("      <div class=\"text-center d-none d-md-inline\">\r\n");
      out.write("        <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Fin de Sidebar -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Content Wrapper -->\r\n");
      out.write("    <div id=\"content-wrapper\" class=\"d-flex flex-column\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Main Content -->\r\n");
      out.write("      <div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Topbar -->\r\n");
      out.write("        <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\r\n");
      out.write("\r\n");
      out.write("          <!-- Sidebar Toggle (Topbar) -->\r\n");
      out.write("          <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\r\n");
      out.write("            <i class=\"fa fa-bars\"></i>\r\n");
      out.write("          </button>\r\n");
      out.write("\r\n");
      out.write("          <!-- Topbar Search -->\r\n");
      out.write("          <img src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/img/esquina.jpg\" height=\"65 px\" width=\"220 px\"> </img>\r\n");
      out.write("\r\n");
      out.write("          <!-- Topbar Navbar -->\r\n");
      out.write("          <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - User Information -->\r\n");
      out.write("            <li class=\"nav-item dropdown no-arrow\">\r\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">Lewis Rengifo</span>\r\n");
      out.write("                <img class=\"img-profile rounded-circle\" src=\"http://www.iconarchive.com/download/i108973/google/noto-emoji-people-profession/10303-man-office-worker-light-skin-tone.ico\">\r\n");
      out.write("              </a>\r\n");
      out.write("              \r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("          </ul>\r\n");
      out.write("\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- End of Topbar -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Begin Page Content -->\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("          <!-- Page Heading -->\r\n");
      out.write("          <h1 class=\"h3 mb-2 text-gray-800\" align=\"Center\">BIENVENIDO A LA ACTIVIDAD DE VOLEIBOL</h1>\r\n");
      out.write("          <p class=\"mb-4\">Encuentra los próximos eventos que organiza tu delegado justo aquí !</p>\r\n");
      out.write("\r\n");
      out.write("          <!-- DataTales Example -->\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("      <div class=\"col-lg-6\">\r\n");
      out.write("          <div class=\"card shadow mb-4\">\r\n");
      out.write("            <div class=\"card-header py-3\">\r\n");
      out.write("              <h6 class=\"m-0 font-weight-bold text-primary\">Calendario de Eventos</h6>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("       \r\n");
      out.write("            <div class=\"card-body\" >\r\n");
      out.write("              <div class=\"table-responsive\">\r\n");
      out.write("                <table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\">            \r\n");
      out.write("                  <iframe src=\"https://calendar.google.com/calendar/embed?height=600&amp;wkst=2&amp;bgcolor=%23039BE5&amp;ctz=America%2FLima&amp;src=YTIwMTY2MjYyQHB1Y3AuZWR1LnBl&amp;src=YWRkcmVzc2Jvb2sjY29udGFjdHNAZ3JvdXAudi5jYWxlbmRhci5nb29nbGUuY29t&amp;src=ZXMucGUjaG9saWRheUBncm91cC52LmNhbGVuZGFyLmdvb2dsZS5jb20&amp;src=ZmlicmEudG94aWNhLnB1Y3BAZ21haWwuY29t&amp;color=%23039BE5&amp;color=%2333B679&amp;color=%230B8043&amp;color=%23B39DDB\" style=\"border-width:0\" width=\"650\" height=\"601\" frameborder=\"0\" scrolling=\"no\"></iframe>  \r\n");
      out.write("                </table>           \r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("       <div class=\"col-lg-6\">\r\n");
      out.write("\r\n");
      out.write("              <div class=\"card shadow mb-4\">\r\n");
      out.write("                <div class=\"card-header py-3\">\r\n");
      out.write("                  <h6 class=\"m-0 font-weight-bold text-primary\">Deseas realizar algo más por la Fibra ?</h6>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                 <div class=\"p-5\"> \r\n");
      out.write("                  <form class=\"user\">\r\n");
      out.write("                  <a href=\"#\" class=\"btn btn-primary btn-block disabled\">\r\n");
      out.write("                    <span class=\"icon text-white-50\">\r\n");
      out.write("                      <i class=\"fas fa-check\"></i>\r\n");
      out.write("                    </span>\r\n");
      out.write("                    <span class=\"text\">Postular a delegado de actividad</span>\r\n");
      out.write("                  </a>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"my-2\"></div>\r\n");
      out.write("                  <a href=\"#\" class=\"btn btn-success btn-block\">\r\n");
      out.write("                    <span class=\"icon text-white-50\">\r\n");
      out.write("                      <i class=\"fas fa-check\"></i>\r\n");
      out.write("                    </span>\r\n");
      out.write("                    <span class=\"text\">Apoyar a la Actividad</span>\r\n");
      out.write("                  </a>\r\n");
      out.write("                  <a href=\"#\" class=\"btn btn-info btn-block\">\r\n");
      out.write("                    <span class=\"icon text-white-50\">\r\n");
      out.write("                      <i class=\"fas fa-check\"></i>\r\n");
      out.write("                    </span>\r\n");
      out.write("                    <span class=\"text\">(...)</span>\r\n");
      out.write("                  </a>\r\n");
      out.write("                </form>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  \r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"card shadow mb-4\">\r\n");
      out.write("                <div class=\"card-header py-3\">\r\n");
      out.write("                  <h6 class=\"m-0 font-weight-bold text-primary\">Todos juntos por la FIBRA !</h6>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                  <div class=\"text-center\">\r\n");
      out.write("                    <img class=\"img-fluid px-3 px-sm-4 mt-3 mb-4\" style=\"width: 15rem;\" src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/img/voleyfemenino.jpg\" >\r\n");
      out.write("                    <img class=\"img-fluid px-3 px-sm-4 mt-3 mb-4\" style=\"width: 17rem;\" src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/img/basquet.jpg\" >\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <p>La Fibra agradece su participación en la actividad de Voleibol. Con tu aporte vamos a dejar a la sección de Ingeniería de las Telecomunicaciones en lo mas alto !</p>\r\n");
      out.write("                  \r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("      </div>\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container-fluid -->\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- End of Main Content -->\r\n");
      out.write("\r\n");
      out.write("      <!-- Footer -->\r\n");
      out.write("      <footer class=\"sticky-footer bg-white\">\r\n");
      out.write("        <div class=\"container my-auto\">\r\n");
      out.write("          <div class=\"copyright text-center my-auto\">\r\n");
      out.write("            <span>Copyright &copy; Your Website 2019</span>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </footer>\r\n");
      out.write("      <!-- End of Footer -->\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End of Content Wrapper -->\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- End of Page Wrapper -->\r\n");
      out.write("\r\n");
      out.write("  <!-- Scroll to Top Button-->\r\n");
      out.write("  <a class=\"scroll-to-top rounded\" href=\"#page-top\">\r\n");
      out.write("    <i class=\"fas fa-angle-up\"></i>\r\n");
      out.write("  </a>\r\n");
      out.write("\r\n");
      out.write("  <!-- Logout Modal-->\r\n");
      out.write("  <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("          <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\r\n");
      out.write("          <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("            <span aria-hidden=\"true\">×</span>\r\n");
      out.write("          </button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\r\n");
      out.write("        <div class=\"modal-footer\">\r\n");
      out.write("          <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("          <a class=\"btn btn-primary\" href=\"login.jsp\">Logout</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Bootstrap core JavaScript-->\r\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Core plugin JavaScript-->\r\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom scripts for all pages-->\r\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/js/sb-admin-2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Page level plugins -->\r\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/vendor/datatables/jquery.dataTables.min.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/vendor/datatables/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Page level custom scripts -->\r\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/js/demo/datatables-demo.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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