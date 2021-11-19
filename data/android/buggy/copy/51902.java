public static java.util.Collection<com.alibaba.dubbo.registry.Registry> getRegistries() {
    return java.util.Collections.unmodifiableCollection(com.alibaba.dubbo.registry.support.AbstractRegistryFactory.REGISTRIES.values());
}