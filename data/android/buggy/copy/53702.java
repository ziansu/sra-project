private void populateAutoComplete() {
    if (!(mayRequestContacts())) {
        return ;
    }
    getLoaderManager().initLoader(0, null, this);
}