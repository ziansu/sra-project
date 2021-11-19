public void removeapplet(processing.core.PApplet tem) {
    mainapplet.start();
    tem.stop();
    add(mainapplet);
}