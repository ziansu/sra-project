public void initialize() {
    initialized = true;
    if (shouldWrite) {
        startDumpersThread();
    }
}