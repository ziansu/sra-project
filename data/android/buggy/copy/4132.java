private org.eclipse.jetty.server.handler.HandlerCollection createHandlers(java.lang.String resourceBase, java.lang.String logs) {
    org.eclipse.jetty.server.handler.HandlerCollection handlers = new org.eclipse.jetty.server.handler.HandlerCollection();
    handlers.setHandlers(new org.eclipse.jetty.server.Handler[]{ createAccessLog(logs) , webappGzipWrapper(createWebApp(resourceBase)) });
    return handlers;
}