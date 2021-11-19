@java.lang.Override
public void onSuccess(java.lang.Void result) {
    de.hdm.itprojekt.noteit.client.NoteitCellBrowser.updateNotebooks();
    dlbQuestion.hide();
    de.hdm.itprojekt.noteit.client.Homepage.hideView();
}