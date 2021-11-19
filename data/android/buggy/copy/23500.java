private void closeFiles() throws java.io.IOException {
    isFasta.close();
    isKClusClusters.close();
    isKClusHeaders.close();
    osFasta.flush();
    osFasta.close();
}