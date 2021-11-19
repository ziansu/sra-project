public io.nlopez.smartlocation.location.providers.MultiFallbackProvider.Builder withDefaultProvider() {
    return this.withProvider(new io.nlopez.smartlocation.location.providers.LocationManagerProvider());
}