public static java.lang.String getCleanName(java.lang.String name) {
    org.objectweb.asm.Type type = org.objectweb.asm.Type.getType(name);
    name = type.getInternalName();
    return name.replaceAll("\\/", ".");
}