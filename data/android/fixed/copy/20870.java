public java.lang.String getLabelForResource(com.theiostream.orcamento.Resource r) {
    com.theiostream.orcamento.Statement stmt = r.getProperty(label);
    if (stmt == null) {
        return null;
    }
    return stmt.getString();
}