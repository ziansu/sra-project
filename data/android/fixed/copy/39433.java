private static java.lang.String getEnv(java.lang.String n, java.lang.String d) {
    java.lang.String v = java.lang.System.getenv(n);
    return v != null ? v.trim() : d;
}