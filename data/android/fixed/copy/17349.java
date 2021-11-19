public static void killCurrentProcess() {
    android.os.Process.killProcess(android.os.Process.myPid());
    java.lang.System.exit(10);
}