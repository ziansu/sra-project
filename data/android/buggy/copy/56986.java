public synchronized java.util.ArrayList<java.lang.String> getZoneIDs() {
    synchronized(zoneMap) {
        java.util.ArrayList<java.lang.String> zIDS = new java.util.ArrayList<>();
        zIDS.addAll(zoneMap.keySet());
        return zIDS;
    }
}