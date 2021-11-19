@java.lang.Override
protected void onResume() {
    super.onResume();
    if (mShowMainUI) {
        loadMainUI();
    }
}