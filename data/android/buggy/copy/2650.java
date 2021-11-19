@java.lang.Override
public java.util.Iterator<edu.usc.irds.sparkler.model.FetchedData> fetch(java.util.Iterator<edu.usc.irds.sparkler.model.Resource> resources) throws java.lang.Exception {
    try (edu.usc.irds.sparkler.CloseableIterator<edu.usc.irds.sparkler.model.FetchedData> iterator = new edu.usc.irds.sparkler.util.FetcherDefault.FetchIterator(resources)) {
        return iterator;
    }
}