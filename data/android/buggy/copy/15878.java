public void close() throws java.lang.Exception {
    controller.removeListener(this);
    controller.delete();
    controller = null;
}