@java.lang.Override
public void destroy() throws java.lang.Exception {
    if ((indexWriter) != null) {
        indexWriter.close();
    }
    jdbcDirectory.close();
}