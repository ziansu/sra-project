@java.lang.Override
public void run() {
    try {
        c = new frontend.Connection();
    } catch (java.io.IOException e) {
        noConnection = true;
        finish();
    }
}