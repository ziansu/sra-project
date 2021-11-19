@java.lang.Override
public void onClick(android.view.View v) {
    pickNewSong();
    Globals.playlistArray.add(new angelhack.seattle.soundhop.SongItem(angelhack.seattle.soundhop.MainActivityFragment.generateID(), angelhack.seattle.soundhop.MainActivityFragment.generateID(), 500));
    angelhack.seattle.soundhop.MainActivityFragment.playlistAdapter.notifyDataSetChanged();
}