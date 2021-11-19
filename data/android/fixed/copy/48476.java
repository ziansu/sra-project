public org.eclipse.ui.console.MessageConsoleStream newStderrMessageStream() {
    org.eclipse.ui.console.MessageConsoleStream out = new org.eclipse.ui.console.MessageConsoleStream(this);
    out.setActivateOnWrite(((page) != null ? page.activeOnStderr() : true));
    return out;
}