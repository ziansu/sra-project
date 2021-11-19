private void prepareLanguageListData() {
    for (java.lang.String lang : fileSystem.extractLangNames()) {
        mLanguages.add(lang);
    }
}