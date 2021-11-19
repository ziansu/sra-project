public boolean refreshList(android.view.MenuItem item) {
    new me.blueland.metro.activity.BusStationPre.BusController().execute(stationCode);
    return true;
}