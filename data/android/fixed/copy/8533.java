@java.lang.Override
public void execute(io.realm.Realm realm) {
    model.getPlaylist().addAll(new java.util.ArrayList(songsList));
    realm.copyToRealmOrUpdate(model);
    listener.onSuccess(true, mContext.getString(R.string.playlist_created));
}