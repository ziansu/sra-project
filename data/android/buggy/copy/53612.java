public java.lang.String getString(java.lang.String s) {
    java.lang.Object o = root.get(s);
    if (o == null) {
        return "";
    }else {
        return ((java.lang.String) (root.get(s)));
    }
}