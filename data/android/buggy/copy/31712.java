@java.lang.Override
public void handleRequest(final io.undertow.server.HttpServerExchange exchange) throws java.lang.Exception {
    pathInfo.getServletChain().forceInit(DispatcherType.ASYNC);
    servletDispatcher.dispatchToPath(exchange, pathInfo, DispatcherType.ASYNC);
}