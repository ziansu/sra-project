@java.lang.Override
public boolean addConnection(com.horstmann.violet.product.diagram.abstracts.edge.IEdge edge) {
    return ((edge.getStartNode()) != (edge.getEndNode())) && (super.addConnection(edge));
}