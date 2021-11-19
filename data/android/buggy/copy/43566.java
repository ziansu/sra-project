@java.lang.Override
public void run() {
    this.addWindowListener(new java.awt.event.WindowAdapter() {
        @java.lang.Override
        public void windowClosing(java.awt.event.WindowEvent e) {
            java.lang.System.exit(0);
        }
    });
    this.setVisible(true);
}