public void getJourneys() {
    java.util.List<java.lang.String> lines = readLinesFromFile();
    if ((year) == 2015) {
        get2015Journeys(lines);
    }else {
        get2014Journeys(lines);
    }
}