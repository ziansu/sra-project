private io.javadog.cws.core.Servicable<io.javadog.cws.api.responses.FetchCircleResponse, io.javadog.cws.api.requests.FetchCircleRequest> prepareService() {
    final io.javadog.cws.common.Settings settings = new io.javadog.cws.common.Settings();
    return new io.javadog.cws.core.services.FetchCirclesService(settings, entityManager);
}