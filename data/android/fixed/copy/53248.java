@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putParcelable(com.owncloud.android.ui.fragment.OCFileListFragment.KEY_FILE, mFile);
    if ((mMultiChoiceModeListener) != null) {
        mMultiChoiceModeListener.storeStateIn(outState);
    }
}