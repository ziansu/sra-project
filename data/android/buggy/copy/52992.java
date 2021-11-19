public org.atmosphere.cpr.AtmosphereServlet.Action resumed(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    org.atmosphere.cpr.AsynchronousProcessor.logger.debug("(resumed) invoked:\n HttpServletRequest: {}\n HttpServletResponse: {}", request, response);
    return action(request, response);
}