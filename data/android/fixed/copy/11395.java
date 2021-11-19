@java.lang.Override
public void setTimePlayed(nuclei.media.MediaInterface mediaInterface, long played) {
    if ((timePlayed) != null)
        timePlayed.setText(stringForTime(played));
    
}