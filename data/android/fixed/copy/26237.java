private java.lang.String getTypeFile() {
    java.io.File mFile = new java.io.File(mUri.getPath());
    return com.anthonymandra.framework.UsefulDocumentFile.getType(mFile);
}