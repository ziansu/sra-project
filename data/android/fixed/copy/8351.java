@java.lang.Override
public boolean onClose() {
    mLocationResultsArray.clear();
    rebuildMap();
    return false;
}