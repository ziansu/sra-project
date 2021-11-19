public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    boolean ret = super.onKeyDown(keyCode, event);
    if ((mPluginActivity) != null) {
        mPluginActivity.onKeyDown(keyCode, event);
    }
    return ret;
}