@java.lang.Override
protected void onPause() {
    super.onPause();
    android.view.View view = findViewById(de.aw.awlibrary.MainActivity.layoutDetailcontainer);
    if (view != null) {
        view.setVisibility(View.GONE);
    }
}