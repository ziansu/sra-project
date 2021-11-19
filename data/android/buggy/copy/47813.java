@org.junit.BeforeClass
public static void beforeClass() {
    com.itextpdf.test.ITextTest.createOrClearDestinationFolder(com.itextpdf.kernel.pdf.PdfXrefTableTest.destinationFolder);
}