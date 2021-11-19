@java.lang.Override
protected void reset() {
    analysisModel = null;
    if ((piaTmpFile) != null) {
        piaTmpFile.delete();
        piaTmpFile = null;
    }
}