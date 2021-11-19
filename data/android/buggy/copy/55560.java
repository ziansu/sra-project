public static boolean isClassBytesOk(final org.slf4j.Logger logger, final byte[] classBytes, final java.lang.String logTag) {
    final org.objectweb.asm.tree.ClassNode classNode = org.apache.drill.exec.compile.AsmUtil.classFromBytes(classBytes);
    return org.apache.drill.exec.compile.AsmUtil.isClassOk(logger, classNode, logTag);
}