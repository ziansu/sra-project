@java.lang.Override
public int getCurrentPosition() {
    if (((musicSrv) != null) && (musicBound)) {
        return musicSrv.getSongPosition();
    }else
        return 0;
    
}