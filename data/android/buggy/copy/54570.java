public void start(java.lang.String ip) {
    java.lang.System.out.println("SendBoxGUI.java: Started!");
    if ((MainMenu.instance) != null)
        MainMenu.instance.dispose();
    
    wifi.SendBoxGUI.otherIP = ip;
    new java.awt.dnd.DropTarget(this, listener);
    this.setEnabled(true);
}