public boolean search(java.lang.String value) {
    if ((root) == null) {
        return false;
    }else {
        return root.search(value);
    }
}