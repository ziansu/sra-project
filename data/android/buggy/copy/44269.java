public boolean checkForFrequentQueries() {
    for (util.SessionObject session : sessionList) {
        if (session.checkForFrequency()) {
            session.printSession();
            return true;
        }
    }
    return false;
}