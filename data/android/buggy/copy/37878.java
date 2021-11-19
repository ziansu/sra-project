@java.lang.Override
public void onSuccess(java.lang.Void result) {
    org.eclipse.kura.web.client.ui.EntryClassUi.hideWaitModal();
    uiParent.refresh();
}