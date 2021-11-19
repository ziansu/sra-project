@java.lang.Override
public java.net.URL getResource(java.lang.String name) {
    for (java.lang.ClassLoader bundleClassLoader : bundleClassLoaders) {
        java.net.URL resource = bundleClassLoader.getResource(name);
        if (resource != null) {
            return resource;
        }
    }
    return null;
}