public boolean getLed() {
    return ((stateMap.get("CurrentLEDState")) != null) && (stateMap.get("CurrentLEDState").equals("On")) ? true : false;
}