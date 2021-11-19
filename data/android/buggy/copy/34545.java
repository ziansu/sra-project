@java.lang.Override
public void openInputFormat() {
    super.openInputFormat();
    try {
        this.splitProcessor.open();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}