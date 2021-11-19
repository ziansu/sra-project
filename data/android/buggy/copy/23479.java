@java.lang.Override
public void onScrollChange(android.view.View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
    if ((listener) != null) {
        listener.setRefresh((scrollY == 0));
    }
}