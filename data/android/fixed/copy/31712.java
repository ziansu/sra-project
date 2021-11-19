@java.lang.Override
public void handleRequest(final io.undertow.server.HttpServerExchange exchange) throws java.lang.Exception {
    servletDispatcher.dispatchToPath(exchange, pathInfo, DispatcherType.ASYNC);
}