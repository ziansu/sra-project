@java.lang.Override
public void run() {
    if ((!(mIsGalleryMode)) && ((mGalleryAdapter) != null)) {
        mGalleryAdapter.clear();
        mGalleryAdapter.notifyDataSetChanged();
        mUpdateThetaList.clear();
    }
    enableReconnectView();
}