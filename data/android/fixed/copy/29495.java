public static void main(java.lang.String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        gui.MainWin gui = gui.MainWin.getInstance();
        gui.setVisible(true);
    });
}