@java.lang.Override
protected void setUp() throws java.lang.Exception {
    out = new java.io.StringWriter();
    builder = new org.eclipse.mylyn.wikitext.asciidoc.internal.AsciiDocDocumentBuilder(out);
}