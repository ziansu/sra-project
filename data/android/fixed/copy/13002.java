public void removeapplet(processing.core.PApplet tem) {
    mainapplet.start();
    tem.stop();
    remove(tem);
    add(mainapplet);
}