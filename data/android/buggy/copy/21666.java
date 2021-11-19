public static void killAllBoxSVC() throws java.io.IOException, java.lang.InterruptedException {
    java.lang.Runtime rt = java.lang.Runtime.getRuntime();
    rt.exec("killall VBoxSVC");
    java.lang.Thread.sleep(6000L);
    rt.exec("killall VBoxNetDHCP");
    java.lang.Thread.sleep(6000L);
}