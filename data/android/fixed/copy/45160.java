public void removeFromView(java.lang.String resource, org.reactome.web.diagram.data.interactors.model.DiagramInteractor interactor) {
    uk.ac.ebi.pwp.structures.quadtree.client.QuadTree<org.reactome.web.diagram.data.interactors.model.DiagramInteractor> tree = interactorsTreeCache.get(resource);
    if (tree != null)
        tree.remove(interactor);
    
}