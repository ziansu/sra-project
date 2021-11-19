@java.lang.Override
protected void onResume() {
    super.onResume();
    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
}