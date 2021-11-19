public void uninstall() {
    try {
        rkey.deleteSubKey("ES2K");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        new kaaass.es2k.crashreport.ErrorUtil(e).dealWithException();
    }
}