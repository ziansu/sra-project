public static void main(java.lang.String[] args) throws java.io.IOException {
    poi.POI.savePlayerScores("Hans", 123456);
    poi.Scores.create(poi.POI.getAllScores());
    testing.TesterClass.testSave();
}