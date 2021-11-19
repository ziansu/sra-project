@java.lang.Override
public void start() {
    getLayout().start();
    super.start();
    setupStackTraceLayout();
    stackTraceLayout.start();
}