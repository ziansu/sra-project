public void setFileName(java.lang.String value) {
    mFileName = value;
    java.io.File fname = new java.io.File(value);
    this.mVokPath = fname.getParent();
}