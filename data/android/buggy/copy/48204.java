@java.lang.Override
public void load() {
    android.util.Log.i(org.oucho.mpdclient.fragments.AlbumSongsFragment.TAG, "load");
    getLoaderManager().restartLoader(0, null, mLoaderCallbacks);
}