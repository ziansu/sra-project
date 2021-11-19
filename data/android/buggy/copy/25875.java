@java.lang.Override
public int getCurrentPosition() {
    if ((((musicSrv) != null) && (musicBound)) && (musicSrv.isPlaying()))
        return musicSrv.getPosition();
    else
        return 0;
    
}