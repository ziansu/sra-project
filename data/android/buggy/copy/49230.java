public static void logClassFromBytes(final org.slf4j.Logger logger, final java.lang.String logTag, final byte[] classBytes) {
    final org.objectweb.asm.tree.ClassNode classNode = org.apache.drill.exec.compile.AsmUtil.classFromBytes(classBytes);
    org.apache.drill.exec.compile.AsmUtil.logClass(logger, logTag, classNode);
}