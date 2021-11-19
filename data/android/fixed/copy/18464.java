@org.sahagin.runlib.external.TestDoc(value = "*")
public void sleep() {
    try {
        java.lang.Thread.sleep(10);
    } catch (java.lang.InterruptedException e) {
        throw new java.lang.RuntimeException(e);
    }
}