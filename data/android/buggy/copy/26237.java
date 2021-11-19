private java.lang.String getTypeFile() {
    java.io.File mFile = new java.io.File(mUri.getPath());
    if (mFile.isDirectory()) {
        return null;
    }else {
        return com.anthonymandra.framework.UsefulDocumentFile.getTypeForName(mFile.getName());
    }
}