public void addObsZone(int num, ObsZone obsZone) {
    if (num < (waypoints.size())) {
        waypoints.get(num).setObsZone(obsZone);
    }
}