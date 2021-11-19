@org.junit.Test(expected = org.corpus_tools.salt.exceptions.SaltParameterException.class)
public void testInputUrlIsNull() throws java.io.IOException {
    org.eclipse.emf.common.util.URI uri = null;
    @java.lang.SuppressWarnings(value = "unused")
    org.corpus_tools.salt.util.VisJsVisualizer visJsVisualizer = new org.corpus_tools.salt.util.VisJsVisualizer(uri);
}