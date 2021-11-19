public void deleteErrorLog() {
    try {
        java.lang.Runtime.getRuntime().exec(("/bin/rm -f " + (this.errorlogLocation)));
    } catch (final java.io.IOException e) {
        e.printStackTrace();
    }
}