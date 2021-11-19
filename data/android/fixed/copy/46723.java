@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent e) {
    java.lang.System.out.println("Closing window");
    if ((fileRequestTimer) != null) {
        fileRequestTimer.cancel();
        fileRequestTimer = null;
    }
    e.getWindow().dispose();
}