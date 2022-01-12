public java.util.Set<java.lang.String> getFavorites() {
    return prefs.getStringSet("list", new java.util.HashSet<java.lang.String>());
}