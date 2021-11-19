@java.lang.Override
public java.util.Enumeration<java.net.URL> getResources(java.lang.String name) throws java.io.IOException {
    if (name.equals(org.wildfly.swarm.container.runtime.ExtensionPreventionClassLoaderWrapper.EXTENSION)) {
        return java.util.Collections.emptyEnumeration();
    }
    return this.delegate.getResources(name);
}