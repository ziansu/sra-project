@java.lang.Override
public void restart() throws java.io.IOException {
    this.getService().stop();
    this.getService().start();
}