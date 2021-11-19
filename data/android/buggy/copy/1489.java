public void loggedIn(connection.MessageTO mTo) {
    service.ServerService.frontController.loggedIn(((service.List<java.lang.String>) (mTo.getBody())), mTo.getType());
}