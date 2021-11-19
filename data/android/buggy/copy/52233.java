public static AsciiDocPage fromFile(java.io.File asciiDocFile) {
    AsciiDocPage.processor = org.asciidoctor.Asciidoctor.Factory.create();
    AsciiDocPage.registerExtensions(AsciiDocPage.processor);
    return AsciiDocPage.getPageFromFile(asciiDocFile);
}