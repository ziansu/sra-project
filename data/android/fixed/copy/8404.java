@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    mSong = dataSnapshot.getValue(com.teinvdlugt.android.piano.Song.class);
    if ((mSong) == null) {
        finish();
    }else {
        loadSong();
    }
}