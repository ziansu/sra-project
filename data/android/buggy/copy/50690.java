protected java.lang.String buildLogMessage(java.lang.Exception ex, javax.servlet.http.HttpServletRequest request) {
    java.lang.String message = (ex != null) ? ex.getMessage() : "null";
    return "Handler execution resulted in exception: " + (message != null ? message : "null");
}