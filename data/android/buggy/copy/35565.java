@java.lang.Override
protected void onDestroy() {
    try {
        manager.onPause();
        camPreview.onPause();
    } catch (java.lang.RuntimeException e) {
    }
    super.onDestroy();
}