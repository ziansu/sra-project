@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent e) {
    java.lang.System.out.println("close");
    getContentPane().removeAll();
    if ((lobby) != null) {
        lobby.dispose();
    }
    java.lang.System.exit(0);
}