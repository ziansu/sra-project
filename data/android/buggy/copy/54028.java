@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0) {
        return com.romankaranchuk.musicplayer.ui.tracklist.TracklistFragment.newInstance();
    }else
        if (position == 1) {
            return com.romankaranchuk.musicplayer.ui.player.PlayerFragment.getSingleton();
        }
    
    return null;
}