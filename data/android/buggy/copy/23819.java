@java.lang.Override
public Loader<List<? extends org.oucho.mpdclient.mpd.item.Item>> onCreateLoader(int id, android.os.Bundle args) {
    android.util.Log.i(org.oucho.mpdclient.fragments.AlbumSongsFragment.TAG, "onCreateLoader");
    return new <org.oucho.mpdclient.fragments.mApp>org.oucho.mpdclient.fragments.loader.AlbumSongLoader(mAlbum);
}