@java.lang.Override
public void onResume() {
    super.onResume();
    if ((getCurrentOrientation()) == (android.content.res.Configuration.ORIENTATION_PORTRAIT)) {
        getToolBar().setTitle("My Notes");
    }
}