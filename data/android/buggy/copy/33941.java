private org.apache.pdfbox.pdmodel.edit.PDPageContentStream createPdPageContentStream() throws java.io.IOException {
    be.quodlibet.boxable.Table.LOGGER.info("createPdPageContentStream");
    return new org.apache.pdfbox.pdmodel.edit.PDPageContentStream(getDocument(), getCurrentPage(), true, true);
}