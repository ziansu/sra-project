@java.lang.Override
public void onPause() {
    saveSketchForStop();
    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
    super.onPause();
}