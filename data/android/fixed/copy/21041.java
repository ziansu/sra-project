public void navigationButtonOnClick(android.view.View v) {
    android.widget.Button button = ((android.widget.Button) (v));
    editing = true;
    setContentView(R.layout.edit_page);
    editPage.loadTimerValues();
}