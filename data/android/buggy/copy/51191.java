public void derefer() {
    org.nschmidt.ldparteditor.data.GData.CACHE_warningsAndErrors.remove(this);
    org.nschmidt.ldparteditor.data.GData.CACHE_lineGeom.remove(this);
    next = null;
    before = null;
}