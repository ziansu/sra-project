@java.lang.Override
public java.lang.String sanitize(java.lang.String toSanitize) {
    if (toSanitize == null)
        return "";
    
    java.lang.String sanitized = toSanitize;
    if (toSanitize.startsWith(base)) {
        sanitized = toSanitize.replaceFirst(base, "");
    }
    return sanitized;
}