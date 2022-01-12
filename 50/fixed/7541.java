@java.lang.Override
public void onAnalysisCompleted(org.reactome.web.pwp.client.common.events.AnalysisCompletedEvent event) {
    setStatusIcon(null, false, false);
    errorPanel.makeVisible(false);
}