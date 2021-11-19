public void run() {
    exception = null;
    try {
        this.enable();
    } catch (org.jnativehook.NativeHookException e) {
        exception = e;
    }
    synchronized(this) {
        this.notifyAll();
    }
}