public void renderDocument(org.apache.poi.xwpf.usermodel.XWPFDocument doc, org.openfuxml.content.ofx.Document docOfx, int lvl) {
    org.openfuxml.renderer.word.structure.WordDocumentRenderer documentRenderer = new org.openfuxml.renderer.word.structure.WordDocumentRenderer(cp, lvl);
    this.doc = documentRenderer.renderer(doc, docOfx);
}