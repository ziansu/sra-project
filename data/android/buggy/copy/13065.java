@java.lang.Override
public void onResume() {
    super.onResume();
    mEngine.addEngineReadyCallback(mReadyCallback);
    refresh();
}