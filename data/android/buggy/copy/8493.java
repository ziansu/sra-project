io.nlopez.smartlocation.location.LocationProvider getCurrentProvider() {
    if (((currentProvider) == null) && (!(providers.isEmpty()))) {
        this.currentProvider = providers.poll();
    }
    return currentProvider;
}