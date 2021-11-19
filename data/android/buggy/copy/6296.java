public void setDataRetriever(org.matrix.androidsdk.data.DataRetriever dataRetriever) {
    checkIfActive();
    mDataRetriever = dataRetriever;
    mDataRetriever.setStore(mStore);
}