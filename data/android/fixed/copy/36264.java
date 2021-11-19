public static com.itextpdf.kernel.font.PdfFont createFont(byte[] fontProgram, java.lang.String encoding, boolean embedded, boolean cached) throws java.io.IOException {
    com.itextpdf.io.font.FontProgram fp = com.itextpdf.io.font.FontProgramFactory.createFont(fontProgram, cached);
    return com.itextpdf.kernel.font.PdfFontFactory.createFont(fp, encoding, embedded);
}