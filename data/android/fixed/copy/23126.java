void close() {
    try {
        java.lang.Runtime.getRuntime().exec("taskkill /F /IM PING.exe");
        java.lang.System.exit(0);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}