@java.lang.Override
public void run() {
    if ((homeA.refresh) != null) {
        homeA.refresh.setActionView(null);
    }
    saveLastPosition();
    invalidateContentFrame();
}