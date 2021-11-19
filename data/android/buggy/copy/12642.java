public void setExpRelayData(int relay, short data, short maskOn, short maskOff) {
    expansionRelays[(relay - 1)].setRelayData(data, maskOn, maskOff);
}