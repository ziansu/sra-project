private static java.lang.String docsFrom(io.coronet.slug.antlr.SlugParser.DocsContext docs) {
    return docs == null ? null : docs.docstring().getText();
}