public org.reactome.web.diagram.data.interactors.model.InteractorEntity getDiagramInteractor(java.lang.String resource, java.lang.String acc) {
    java.util.Map<java.lang.String, org.reactome.web.diagram.data.interactors.model.InteractorEntity> cache = interactorsCache.get(resource);
    if (cache != null)
        return cache.get(acc);
    
    return null;
}