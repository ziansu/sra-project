@java.lang.Override
protected void finalize() {
    try {
        nativeFinalize();
    } catch (java.lang.Throwable e) {
        e.printStackTrace();
    }
}