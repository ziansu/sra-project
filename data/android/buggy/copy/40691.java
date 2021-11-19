public void start() {
    addAll();
    javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            bar = new gui.ControlBar(controller);
        }
    });
}