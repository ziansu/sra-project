private com.taozeyu.calico.web_services.Response getErrorMessageResponse(com.taozeyu.calico.web_services.Response.IStatus state, java.lang.String errorMessage) {
    java.lang.String contentType = "text/html";
    java.lang.System.err.println(errorMessage);
    return new com.taozeyu.calico.web_services.Response(state, contentType, errorMessage);
}