public void start(@android.support.annotation.NonNull
final android.content.ContentResolver cr, @android.support.annotation.NonNull
final com.bilibili.boxing.model.callback.IAlbumTaskCallback callback) {
    buildAlbumInfo(cr);
    getAlbumList(callback);
}