@java.lang.Override
public boolean isVisible(org.reactome.web.diagram.data.layout.DiagramObject item) {
    java.lang.Boolean isTrivial = ((org.reactome.web.diagram.data.layout.Node) (item)).getTrivial();
    return (isTrivial == null) || (!isTrivial);
}