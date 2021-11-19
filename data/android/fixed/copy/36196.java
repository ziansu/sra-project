@android.support.annotation.Nullable
@java.lang.Override
protected java.util.List<pasta.streamer.data.PlaylistListData> run() throws java.lang.InterruptedException {
    return pasta.getPlaylists(data);
}