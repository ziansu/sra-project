@java.lang.Override
protected void setUpBroker(boolean clearDataDir) throws java.lang.Exception {
    if (clearDataDir && (dataFileDir.getRoot().exists()))
        org.apache.commons.io.FileUtils.cleanDirectory(dataFileDir.getRoot());
    
    super.setUpBroker(clearDataDir);
}