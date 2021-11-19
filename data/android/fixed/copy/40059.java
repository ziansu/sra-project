public static void clone(final java.lang.String routeId) {
    final com.uaihebert.uaimockserver.model.UaiRoute uaiRoute = com.uaihebert.uaimockserver.repository.UaiRouteRepository.findById(routeId);
    final com.uaihebert.uaimockserver.model.UaiRoute clonedRoute = com.uaihebert.uaimockserver.factory.UaiRouteFactory.clone(uaiRoute);
    com.uaihebert.uaimockserver.repository.UaiRouteRepository.create(clonedRoute);
    com.uaihebert.uaimockserver.repository.UaiRouteRepository.update();
}