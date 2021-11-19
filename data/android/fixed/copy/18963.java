public java.lang.String translate(java.lang.String key, java.lang.Object... format) {
    try {
        return java.lang.String.format(bundle.localize(key), format);
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        return key;
    }
}