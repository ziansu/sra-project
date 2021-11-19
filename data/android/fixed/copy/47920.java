public void parseFromPDF(java.io.InputStream fileStream) {
    regweb.util.PDFTextParser pdfTextParserObj = new regweb.util.PDFTextParser();
    try {
        pdfTextParserObj.parsePdf(fileStream, "d:\\out.txt");
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}