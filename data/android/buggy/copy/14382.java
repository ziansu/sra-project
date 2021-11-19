public com.itextpdf.kernel.pdf.PdfObject getRichText() {
    return getPdfObject().getAsDictionary(PdfName.RC);
}