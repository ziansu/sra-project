@java.lang.Override
public void onSuccess(java.lang.Void result) {
    de.hdm.itprojekt.noteit.client.EditNotebook.getAllPermittedUsersbyNotebookID(de.hdm.itprojekt.noteit.client.EditNotebook.currentNotebook.getId());
}