@java.lang.Override
public void onPageSelected(int page) {
    android.util.Log.d(de.blau.android.propertyeditor.PropertyEditor.DEBUG_TAG, ("onPageSelected " + page));
    if ((page == (tagFormFragmentPosition)) && ((tagFormFragment) != null)) {
        tagFormFragment.update();
    }
}