public static void main(java.lang.String[] args) {
    DataProcessor.players = DataImporter.readDataFile();
    DataProcessor.findGameCounts();
    DataProcessor.eliminateInfrequentGameCounts(DataProcessor.MIN_SUPPORT);
    DataProcessor.aprioriAlg(DataProcessor.MIN_SUPPORT);
}