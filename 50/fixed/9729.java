public void onClick(android.content.DialogInterface dialog, int id) {
    for (de.dhbwloerrach.beaconlocation.models.Beacon beacon : new java.util.ArrayList(selectedBeacons)) {
        selectedBeacons.remove(beacon);
        databaseHandler.deleteBeacon(beacon);
    }
    updateBeaconListView();
    updateMenuButtons();
}