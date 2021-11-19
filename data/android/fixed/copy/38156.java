public void setMIMEType(java.lang.String mimeType) throws org.sleuthkit.datamodel.TskCoreException, org.sleuthkit.datamodel.TskDataException {
    if ((this.mimeType) != null) {
        throw new org.sleuthkit.datamodel.TskDataException("Mime type has already been set");
    }
    getSleuthkitCase().setFileMIMEType(this, mimeType);
    this.mimeType = mimeType;
}