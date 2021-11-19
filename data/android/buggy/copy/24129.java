public static java.lang.String getOSName() {
    if ((OS.name) == null) {
        OS.name = java.lang.System.getProperty("os.name");
    }
    return OS.name;
}