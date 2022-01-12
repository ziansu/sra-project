@java.lang.Override
protected void finalize() throws java.lang.Throwable {
    super.finalize();
    if ((mLeakedException) != null) {
        mLeakedException = null;
    }
}