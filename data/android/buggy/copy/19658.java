@java.lang.Override
protected void onPostExecute(final java.util.ArrayList<com.sidzi.circleofmusic.entities.Track> tracks) {
    super.onPostExecute(tracks);
    trackListAdapter.updateTracks(tracks);
    new com.sidzi.circleofmusic.helpers.DatabaseSynchronization(mContext, tracks).execute();
}