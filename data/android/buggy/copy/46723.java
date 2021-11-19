@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent e) {
    java.lang.System.out.println("Closing window");
    fileRequestTimer.cancel();
    fileRequestTimer = null;
    e.getWindow().dispose();
}