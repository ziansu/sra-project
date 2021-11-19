@java.lang.Override
public void handleEvent(org.osgi.service.event.Event event) {
    org.bbaw.bts.ui.corpus.parts.annotationsPart.RelatedObjectGroup roGroup = ((org.bbaw.bts.ui.corpus.parts.annotationsPart.RelatedObjectGroup) (event.widget));
    selfselection = true;
    setSelectedInternal(java.util.Arrays.asList(roGroup), true);
    selfselection = false;
}