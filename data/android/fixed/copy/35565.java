@java.lang.Override
protected void onDestroy() {
    try {
        camPreview.onPause();
        manager.onPause();
    } catch (java.lang.RuntimeException e) {
    }
    super.onDestroy();
}