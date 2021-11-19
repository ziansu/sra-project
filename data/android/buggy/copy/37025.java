public void setListAdapter(android.widget.ListAdapter adapter) {
    synchronized(this) {
        org.xbmc.android.util.LOG.D(org.xbmc.android.remote.presentation.controller.FileListController.TAG, "setListAdapter()...");
        mAdapter = adapter;
        mList.setAdapter(mAdapter);
    }
}