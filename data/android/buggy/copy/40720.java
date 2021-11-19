private void addHttpData(org.restlet.Request request, org.forgerock.openam.audit.AMAccessAuditEventBuilder builder) {
    javax.servlet.http.HttpServletRequest servletRequest = org.restlet.ext.servlet.ServletUtils.getRequest(request);
    if (servletRequest != null) {
        builder.forHttpServletRequest(servletRequest);
    }
}