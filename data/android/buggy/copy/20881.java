public ika.geoimport.GeoObject read(java.lang.String filePath) throws java.io.IOException {
    java.net.URL url = ika.utils.URLUtils.filePathToURL(filePath);
    ika.geoimport.SynchroneDataReceiver dataReceiver = new ika.geoimport.SynchroneDataReceiver();
    this.read(url, dataReceiver, ika.geoimport.GeoImporter.SAME_THREAD);
    return dataReceiver.getImportedData();
}