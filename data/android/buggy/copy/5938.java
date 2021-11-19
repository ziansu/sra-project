@java.lang.Override
public void onError(org.reactome.web.pwp.client.tools.analysis.submitters.Request request, java.lang.Throwable exception) {
    setStatusIcon(CommonImages.INSTANCE.error(), true);
    fireEvent(new org.reactome.web.pwp.client.tools.analysis.event.ServiceUnavailableEvent());
}