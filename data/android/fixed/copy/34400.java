protected boolean designDocContainsAllView() {
    if (db.contains(stdDesignDocumentId)) {
        org.ektorp.support.DesignDocument dd = db.get(org.ektorp.support.DesignDocument.class, stdDesignDocumentId);
        return dd.containsView("all");
    }
    return false;
}