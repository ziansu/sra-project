@java.lang.Override
public void onInitialized() {
    if (isLoggedIn()) {
        updateMyprofile(false);
    }
}