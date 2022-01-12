public void actionPerformed(java.awt.event.ActionEvent e) {
    if (lischt.kill()) {
        java.lang.System.out.println("dig is kill");
    }
    lischt.frameAdvance();
    repaint();
}