private java.lang.Integer getOrientationId() {
    init();
    return (mExifDir) == null ? 0 : mExifDir.getInteger(ExifDirectoryBase.TAG_ORIENTATION);
}