@java.lang.Override
public org.gradle.internal.reflect.Instantiator injectAndDecorate(org.gradle.internal.service.ServiceRegistry registry) {
    return new org.gradle.api.internal.DependencyInjectingInstantiator(classGenerator, registry, constructorCache);
}