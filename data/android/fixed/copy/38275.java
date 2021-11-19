@java.lang.Override
public void onDrawerClosed(android.view.View v) {
    if ((getSupportActionBar()) != null)
        getSupportActionBar().setTitle(oldTitle);
    
}