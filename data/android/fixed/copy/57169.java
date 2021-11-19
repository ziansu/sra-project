@java.lang.Override
protected void onDestroy() {
    if ((preview) != null) {
        preview.setPreviewCallback(null);
        preview.close();
        preview = null;
    }
    super.onDestroy();
}