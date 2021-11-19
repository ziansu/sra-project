@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent e) {
    java.lang.String disconnect = ("/d/" + (networking.getID())) + "/e/";
    send(disconnect, false);
    networking.close();
    running = false;
}