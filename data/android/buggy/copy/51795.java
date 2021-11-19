@java.lang.Override
protected void doGet(final javax.servlet.http.HttpServletRequest req, final javax.servlet.http.HttpServletResponse resp) throws java.io.IOException, javax.servlet.ServletException {
    ch.rabbithole.sra.ResourceConfiguration configuration = getConfiguration();
    configuration.executeResource(objectFactory, HttpVerb.GET, req, resp);
}