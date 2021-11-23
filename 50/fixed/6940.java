public void removeapplet(processing.core.PApplet tem) {
    mainapplet.start();
    remove(tem);
    add(mainapplet);
}