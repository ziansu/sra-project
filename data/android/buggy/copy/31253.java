@java.lang.Override
protected java.net.URL findResource(java.lang.String name) {
    for (java.lang.ClassLoader bundleClassLoader : bundleClassLoaders) {
        java.net.URL resource = bundleClassLoader.getResource(name);
        if (resource != null) {
            return resource;
        }
    }
    return null;
}