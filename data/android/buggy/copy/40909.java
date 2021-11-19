public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        GUI.shutdown();
    } catch (java.lang.RuntimeException | java.io.IOException e1) {
        e1.printStackTrace();
    }
}