@java.lang.Override
public void run() {
    try {
        v.setEnabled(false);
        YTsearch();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}