private void insertCategories(java.util.Set<org.totschnig.myexpenses.export.qif.QifCategory> categories) {
    for (org.totschnig.myexpenses.export.qif.QifCategory category : categories) {
        totalCategories += category.insert(categoryToId, true);
    }
}