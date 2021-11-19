private void drawAndParse(org.nschmidt.ldparteditor.composites.Composite3D c3d) {
    final org.nschmidt.ldparteditor.data.DatFile df = c3d.getLockableDatFileReference();
    drawAndParse(c3d, df);
}