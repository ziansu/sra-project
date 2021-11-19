public void doHead(info.orestes.rest.Request request, info.orestes.rest.Response response) throws info.orestes.rest.error.RestException, java.io.IOException {
    doGet(request, response);
    response.resetBuffer();
    response.setContentLength(0);
    response.getOutputStream().close();
}