@java.lang.Override
public boolean onClusterItemClick(idv.seventhmoon.hkinfomap.Place place) {
    if (((itemClickCount)++) >= 3) {
        showInterstitalAd();
    }
    return false;
}