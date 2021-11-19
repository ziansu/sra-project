public boolean setLanguageFromPref(java.lang.Class cl) {
    if (status) {
        setLocale(language, cl);
        return true;
    }else
        return false;
    
}