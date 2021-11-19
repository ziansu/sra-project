private org.apache.pdfbox.pdmodel.edit.PDPageContentStream createPdPageContentStream() throws java.io.IOException {
    return new org.apache.pdfbox.pdmodel.edit.PDPageContentStream(getDocument(), getCurrentPage(), true, true);
}