private void addAuthMethodHeader(play.mvc.Http.Response response) {
    response.setHeader(Http.HeaderNames.WWW_AUTHENTICATE, "basic");
}