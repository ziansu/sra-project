@java.lang.Override
public org.freeplane.features.presentations.mindmapmode.Slide saveAs(java.lang.String name) {
    return new org.freeplane.features.presentations.mindmapmode.Slide(name, new java.util.LinkedHashSet<java.lang.String>(), centersSelectedNode, changesZoom, zoom, showsOnlySpecificNodes, showsAncestors, showsDescendants, filterCondition);
}