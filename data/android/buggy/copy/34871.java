public static java.util.jar.Attributes readManifest(java.io.File jarFile) throws java.io.FileNotFoundException, java.io.IOException {
    java.util.jar.JarInputStream jar = new java.util.jar.JarInputStream(new java.io.FileInputStream(jarFile));
    return jar.getManifest().getMainAttributes();
}