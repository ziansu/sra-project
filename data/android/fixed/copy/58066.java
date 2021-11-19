@java.lang.Override
public void onBackStackChanged() {
    android.app.Fragment f = getFragmentManager().findFragmentById(R.id.mainContent);
    if (f != null)
        setTitle(f.getTag());
    
}