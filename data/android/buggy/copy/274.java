@java.lang.Override
public void onFailure(java.lang.Throwable e) {
    e.printStackTrace();
    org.nesty.core.httpserver.HttpServerStats.setLastServFailID(httpContext.getRequestId());
    sendResponse(org.nesty.core.httpserver.rest.response.HttpResponseBuilder.create(HttpResponseStatus.SERVICE_UNAVAILABLE));
}