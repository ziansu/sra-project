@java.lang.Override
public void onDetach() {
    super.onDetach();
    mListener = null;
    if ((mCarListAdapter) != null) {
        mCarListAdapter.cleanup();
    }
}