@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    mSelectedOrganization = (position != 0) ? mUserScopes.get(position) : null;
    mActivity.invalidateFragments();
}