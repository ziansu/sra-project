private void disposeLoggers() {
    if ((logListener) != null) {
        org.eclipse.core.runtime.Platform.removeLogListener(logListener);
    }
}