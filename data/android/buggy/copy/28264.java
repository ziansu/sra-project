@java.lang.Override
public void onActivate() {
    createRestApiClient();
    try {
        start();
    } catch (java.lang.Exception e) {
        close();
    }
}