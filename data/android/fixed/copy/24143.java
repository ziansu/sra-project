protected void notifyTestFinished(long numOfExplored, long numOfGenerated) {
    for (korat.testing.ITestCaseListener client : clients)
        client.notifyTestFinished(numOfExplored, numOfGenerated);
    
    for (korat.testing.ITestCaseListener special : specialClients)
        special.notifyTestFinished(numOfExplored, numOfGenerated);
    
}