@java.lang.Override
public <T> org.juzu.impl.spi.inject.InjectBuilder bindProvider(java.lang.Class<T> type, javax.inject.Provider<T> provider) {
    boundBeans.put(type, new org.juzu.impl.spi.inject.cdi.ProviderBean(type, provider));
    return this;
}