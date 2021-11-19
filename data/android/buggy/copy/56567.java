@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    try {
        service.pause();
    } catch (java.lang.Exception e) {
    }
}