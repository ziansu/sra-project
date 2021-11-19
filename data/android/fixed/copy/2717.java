public void deleteErrorLog() {
    try {
        java.lang.Runtime.getRuntime().exec(("/bin/rm -f " + (errorlogLocation)));
    } catch (final java.io.IOException e) {
        e.printStackTrace();
    }
}