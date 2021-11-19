@org.sahagin.runlib.external.TestDoc(value = "*")
private void sleep() {
    try {
        java.lang.Thread.sleep(10);
    } catch (java.lang.InterruptedException e) {
        throw new java.lang.RuntimeException(e);
    }
}