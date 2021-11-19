public void addProvider(be.nabu.libs.converter.api.ConverterProvider<?, ?> provider) {
    synchronized(availableProviders) {
        availableProviders.add(provider);
    }
    providers.clear();
}