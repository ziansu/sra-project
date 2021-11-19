public void removeStationAt(int i) {
    com.tk_squared.varmint.tkkStation s = stations.get(i);
    dataSource.deleteStation(s);
    stations.remove(i);
}