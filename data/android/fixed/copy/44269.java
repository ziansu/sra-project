public boolean checkForFrequentQueries() {
    for (util.SessionObject session : sessionList) {
        if (session.checkForFrequency()) {
            return true;
        }
    }
    return false;
}