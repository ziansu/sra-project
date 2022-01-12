public java.lang.String getType() {
    return (isConfidential()) && (type.equals("String")) ? "GuardedString" : (type.substring(0, 1).toUpperCase()) + (type.substring(1));
}