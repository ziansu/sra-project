@java.lang.Override
public void init() throws javax.servlet.ServletException {
    super.init();
    dao = new data.PresidentDaoImpl(getServletContext());
}