public java.io.File getRelPosNoOptFile(int timeSlice) {
    return new java.io.File(this.metadataPath, gov.nist.isg.mist.stitching.gui.params.OutputParameters.getRelPosNoOptFileName(timeSlice));
}