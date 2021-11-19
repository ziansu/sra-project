@java.lang.Override
public void setId(java.lang.String id) {
    if ((id != null) && (!(id.isEmpty()))) {
        org.corpus_tools.salt.graph.Identifier identifier = org.corpus_tools.salt.graph.GraphFactory.createIdentifier(this, id);
    }
}