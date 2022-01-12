io.nlopez.smartlocation.location.LocationProvider getCurrentProvider() {
    if (((currentProvider) == null) && (!(providers.isEmpty()))) {
        currentProvider = providers.poll();
    }
    return currentProvider;
}