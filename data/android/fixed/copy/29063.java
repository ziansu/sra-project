public static void run() {
    MicroSearch.readInDocs();
    MicroSearch.processAndIndex();
    MicroSearch.keywordSearchOp();
    MicroSearch.nfile.ProcessStatsCall();
    MicroSearch.vectorSpace.runVectorSpaceModel();
}