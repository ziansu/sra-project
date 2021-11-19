void close() {
    try {
        java.lang.Process x = java.lang.Runtime.getRuntime().exec("taskkill /F /IM PING.exe");
        java.lang.System.exit(0);
        java.lang.System.out.println("AtCk");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}