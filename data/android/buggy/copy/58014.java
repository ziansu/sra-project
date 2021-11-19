@java.lang.Override
public void linkIn(final com.syncleus.ferma.VertexFrame vertex, final java.lang.String... labels) {
    for (final java.lang.String label : labels)
        this.getElement().addEdge(label, vertex.getElement(), null);
    
}