@java.lang.Override
public void onFailure(java.lang.Throwable caught) {
    errorLabel.setText(caught.getMessage());
    getEditButton().setEnabled(true);
    getEditButton().setFocus(false);
    ua.nure.ostpc.malibu.shedule.client.LoadingPanel.stop();
}