@java.lang.Override
public void runWorkflow() {
    loadData();
    runBlocking();
    DataModel.SimilarityPairs simPairs = runSimilarityComputations();
    runClustering(simPairs);
}