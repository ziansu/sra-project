@java.lang.Override
public void onSubmit(org.reactome.web.pwp.client.tools.analysis.submitters.FormPanel.SubmitEvent event) {
    setStatusIcon(CommonImages.INSTANCE.loader(), true);
    errorPanel.makeVisible(false);
}