@java.lang.Override
public void onDiagramLoaded(org.reactome.web.diagram.data.loader.DiagramLoadedEvent event) {
    context = event.getContext();
    content = context.getContent();
    if ((org.reactome.web.diagram.data.loader.LoaderManager.INTERACTORS_RESOURCE) != null) {
        eventBus.fireEventFromSource(new org.reactome.web.diagram.data.loader.InteractorsResourceChangedEvent(org.reactome.web.diagram.data.loader.LoaderManager.INTERACTORS_RESOURCE), this);
    }
}