private boolean checkup() {
    if ((httpContext.getRequestMethod()) == (org.nesty.commons.constant.http.RequestMethod.UNKOWN)) {
        sendResponse(org.nesty.core.httpserver.rest.response.HttpResponseBuilder.create(HttpResponseStatus.METHOD_NOT_ALLOWED));
        return false;
    }
    return true;
}