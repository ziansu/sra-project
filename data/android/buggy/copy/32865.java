@java.lang.Override
public void onDestroyView() {
    super.onDestroyView();
    setListAdapter(null);
    initialized = false;
    mPlaylist = null;
    mHistoryButtonFlag = true;
}