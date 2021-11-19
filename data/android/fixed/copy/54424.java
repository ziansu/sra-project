@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((sk.henrichg.phoneprofilesplus.EditorProfilesActivity.instance) == null) {
        sk.henrichg.phoneprofilesplus.EditorProfilesActivity.instance = this;
        refreshGUI(false, false);
    }
}