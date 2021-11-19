@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    anchorsManager.removeAnchor(anchorView);
    com.alexshtf.offlinenavigator.MapsDb.removeAnchor(mapsDbOpenHelper, mapId, com.alexshtf.offlinenavigator.AnchorsManager.pointOnImageOf(anchorView));
    return true;
}