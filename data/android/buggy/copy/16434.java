public void prendiIlPrimo() {
    if ((rssiList.size()) != 0) {
        rssi = ((int) (rssiList.get(1)));
        rssiList.clear();
    }else {
        rssi = 0;
    }
}