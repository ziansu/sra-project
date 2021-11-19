public void sessionDestroyed(javax.servlet.http.HttpSessionEvent arg0) {
    core.Server serv = ((core.Server) (arg0.getSession().getServletContext().getAttribute("server")));
    serv.decActiveUsers();
}