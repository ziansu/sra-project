private boolean skipLang(java.lang.String langToCheck, java.util.List<java.lang.String> langs) {
    for (java.lang.String lang : langs) {
        if (langToCheck.equals(lang)) {
            return false;
        }
    }
    return true;
}