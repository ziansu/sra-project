public org.vudroid.core.codec.CodecPage getPage(int pageNumber) {
    return org.vudroid.pdfdroid.codec.PdfPage.createPage(core, pageNumber);
}