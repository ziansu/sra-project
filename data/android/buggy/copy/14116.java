public java.lang.String[] getBlacklist() {
    java.lang.String nos = _pref.getString("blacklist", "");
    return nos.split(",");
}