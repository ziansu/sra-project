public java.lang.Boolean run() {
    final java.lang.String str = java.lang.System.getProperty("glass.disableThreadChecks", "true");
    return "true".equalsIgnoreCase(str);
}