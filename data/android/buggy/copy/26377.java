public java.lang.ClassLoader getClassLoader() {
    java.net.URL.setURLStreamHandlerFactory(null);
    java.net.URL.setURLStreamHandlerFactory(new slash.navigation.gui.jarinjar.JarInJarURLStreamHandlerFactory(classLoader));
    return classLoader;
}