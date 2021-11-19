public void addOption(java.lang.String key, java.lang.String value) {
    if ((getOptions()) == null) {
        super.setOptions(new java.util.HashMap<java.lang.String, java.lang.String>());
    }
    getOptions().put(key, value);
}