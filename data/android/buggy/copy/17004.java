private void initToken() {
    java.lang.String token = (Window.Location.getPath()) + (Window.Location.getQueryString());
    setToken(token);
    com.wallissoftware.pushstate.client.PushStateHistorianImpl.replaceState(relativePath, getToken());
}