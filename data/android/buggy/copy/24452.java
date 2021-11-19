@java.lang.Override
public void loadAlbums() {
    android.content.ContentResolver cr = mTasksView.getAppCr();
    if (cr == null) {
        return ;
    }
    com.bilibili.boxing.model.BoxingManager.getInstance().loadAlbum(cr, mLoadAlbumCallback);
}