@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent arg0) {
    java.lang.System.out.println("hoi");
    client.getGUI().removePGUI(this.conn.other);
    this.conn.stop();
}