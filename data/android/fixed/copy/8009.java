@java.lang.Override
public void onFailure(final java.lang.Throwable caught) {
    org.eclipse.kura.web.client.ui.EntryClassUi.hideWaitModal();
    org.eclipse.kura.web.client.util.FailureHandler.handle(caught);
}