public java.io.File getRelPosNoOptFile(int timeSlice) {
    return new java.io.File(this.metadataPath, getRelPosNoOptFileName(timeSlice));
}