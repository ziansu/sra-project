@java.lang.Override
public long getAdCurrentPosition() {
    if ((adsProvider) != null) {
        long currPos = (com.kaltura.playkit.utils.Consts.MILLISECONDS_MULTIPLIER) * (adsProvider.getCurrentPosition());
        return currPos;
    }
    return com.kaltura.playkit.utils.Consts.POSITION_UNSET;
}