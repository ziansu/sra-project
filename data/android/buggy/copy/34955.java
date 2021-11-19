@java.lang.Override
public void onClick(android.view.View v) {
    addFavorite(_station, _station.getName(), false);
    getListPagerAdapter().setupBTabStationARecap(_station);
}