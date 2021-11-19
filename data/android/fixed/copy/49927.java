@java.lang.Override
protected void onResume() {
    super.onResume();
    pView.addPuzzleViewListener(this);
    loadPreferences();
}