@java.lang.Override
public void run() {
    dorkbox.systemTray.util.Swt.currentDisplay.getShells()[0].addListener(org.eclipse.swt.SWT.Close, new dorkbox.systemTray.util.Listener() {
        @java.lang.Override
        public void handleEvent(final dorkbox.systemTray.util.Event event) {
            runnable.run();
        }
    });
}