@java.lang.Override
protected void doGet(final javax.servlet.http.HttpServletRequest req, final javax.servlet.http.HttpServletResponse resp) throws java.io.IOException, javax.servlet.ServletException {
    configuration.executeResource(objectFactory, HttpVerb.GET, req, resp);
}