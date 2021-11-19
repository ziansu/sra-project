@java.lang.Override
public void onDetach() {
    super.onDetach();
    mListener = null;
    mCarListAdapter.cleanup();
}