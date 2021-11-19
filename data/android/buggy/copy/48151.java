public void sendJsonError(io.undertow.server.HttpServerExchange exchange, int statusCode, java.lang.String errorMsg) throws com.fasterxml.jackson.core.JsonProcessingException {
    com.blyxa.servlite.ErrorException ee = new com.blyxa.servlite.ErrorException(statusCode, errorMsg);
    sendJson(exchange, ee);
}