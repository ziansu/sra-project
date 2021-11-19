@java.lang.Override
public int getDuration() {
    if (((musicSrv) != null) && (musicBound))
        return musicSrv.getDuration();
    else
        return 0;
    
}