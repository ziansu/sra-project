public java.lang.String[] getBlacklist() {
    java.lang.String nos = _pref.getString("blacklist", "");
    if (nos.equals(""))
        return new java.lang.String[]{  };
    
    return nos.split(",");
}