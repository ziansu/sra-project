private final void initToken() {
    final java.lang.String token = (Window.Location.getPath()) + (Window.Location.getQueryString());
    this.setToken(token);
    com.wallissoftware.pushstate.client.PushStateHistorianImpl.replaceState(this.relativePath, this.getToken());
}