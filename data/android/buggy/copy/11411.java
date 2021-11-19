public void placeBeacon(lilium.arubabacon.iBeacon beacon) {
    if (unplacedBeacons.contains(beacon)) {
        synchronized(placedBeacons) {
            placedBeacons.add(beacon);
        }
        synchronized(unplacedBeacons) {
            unplacedBeacons.remove(beacon);
        }
    }
}