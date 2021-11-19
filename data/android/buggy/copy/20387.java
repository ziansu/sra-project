public static com.excelsiorjet.api.tasks.ClasspathEntry.ProtectionType fromString(java.lang.String protectType) {
    try {
        return com.excelsiorjet.api.tasks.ClasspathEntry.ProtectionType.valueOf(com.excelsiorjet.api.util.Utils.parameterToEnumConstantName(protectType));
    } catch (java.lang.Exception e) {
        return null;
    }
}