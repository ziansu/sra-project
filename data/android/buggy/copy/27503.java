public void addapplet(processing.core.PApplet tem) {
    mainapplet.stop();
    tem.init();
    tem.start();
    tem.setVisible(true);
    add(tem);
}