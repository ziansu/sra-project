public boolean createNewList(java.lang.String listName) {
    databaseAccess.open();
    if (databaseAccess.listNameValidity(listName)) {
        databaseAccess.createGList(listName);
        databaseAccess.close();
        return true;
    }
    return false;
}