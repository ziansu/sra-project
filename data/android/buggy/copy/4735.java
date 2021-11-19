@java.lang.Override
public void mouseDown(org.eclipse.swt.events.MouseEvent e) {
    if (hlShell.isDisposed()) {
        removeListeners();
    }
    if ((e.button) == 1) {
        onBoardingManager.close();
    }
}