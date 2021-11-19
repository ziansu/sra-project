@java.lang.Override
protected java.util.List<com.journee.model.Journal> doInBackground(java.lang.String... idsInServer) {
    java.util.List<com.journee.model.Journal> journals = executeGetJournals(idsInServer);
    for (com.journee.model.Journal journal : journals) {
    }
    return journals;
}