public org.eclipse.graphiti.mm.pictograms.Diagram getDiagram() {
    org.eclipse.graphiti.mm.pictograms.Diagram diag = diagram;
    if ((diagram) == null) {
        diag = this.getDiagramTypeProvider().getDiagram();
        diagram = diag;
    }
    return diag;
}