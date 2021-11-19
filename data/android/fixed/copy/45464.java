public void removeStationAt(int i) {
    dataSource.deleteStation(stations.get(i));
    stations.remove(i);
}