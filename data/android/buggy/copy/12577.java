protected void execute(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    LOGGER.debug("started");
    try {
        applicationController.processRequest(request, response);
    } catch (java.lang.Exception e) {
        response.sendError(500);
    }
}