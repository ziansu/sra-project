@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    try {
        mCallbacks = ((org.onebusaway.android.ui.NavigationDrawerFragment.NavigationDrawerCallbacks) (activity));
    } catch (java.lang.ClassCastException e) {
        throw new java.lang.ClassCastException("Activity must implement NavigationDrawerCallbacks.");
    }
}