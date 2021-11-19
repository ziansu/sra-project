@java.lang.Override
public <T> toothpick.Lazy<T> getLazy(java.lang.Class<T> clazz, java.lang.String name) {
    javax.inject.Provider<T> provider = getProvider(clazz, name);
    return new toothpick.ProviderImpl(provider, true);
}