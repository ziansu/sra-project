public boolean setLanguageFromPref(java.lang.Class cl) {
    if (status) {
        setLocale(language, cl, false);
        return true;
    }else
        return false;
    
}