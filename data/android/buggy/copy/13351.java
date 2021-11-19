javassist.CtClass toCtClass() throws java.io.IOException {
    try (java.io.InputStream is = jarFile.getInputStream(entry)) {
        javassist.CtClass ctClass = classPool.makeClass(is);
        return ctClass;
    }
}