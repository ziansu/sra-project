@com.google.inject.Provides
@com.google.inject.Singleton
@com.netflix.archaius.api.inject.LibrariesLayer
com.netflix.archaius.api.config.CompositeConfig getLibrariesLayer() {
    return new com.netflix.archaius.config.DefaultCompositeConfig();
}