@org.junit.Test(expected = ddf.catalog.transform.CatalogTransformerException.class)
public void testPasswordProtected() throws ddf.catalog.transform.CatalogTransformerException, java.io.IOException {
    ddf.catalog.transformer.input.pptx.PptxInputTransformer t = new ddf.catalog.transformer.input.pptx.PptxInputTransformer(inputTransformer);
    try (java.io.InputStream is = getResource("/password-powerpoint.pptx")) {
        t.transform(is);
    }
}