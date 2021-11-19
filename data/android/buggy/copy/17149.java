@java.lang.Override
public void onSuccess(de.hdm.itprojekt.noteit.client.Notebook result) {
    de.hdm.itprojekt.noteit.client.EditNotebook.lblHeaderTitel.setText(de.hdm.itprojekt.noteit.client.EditNotebook.tbNotebookTitel.getText());
    de.hdm.itprojekt.noteit.client.EditNotebook.rootLogger.log(java.util.logging.Level.SEVERE, "NB Speicher Button");
    de.hdm.itprojekt.noteit.client.NoteitCellBrowser.getNotebookList(result);
}