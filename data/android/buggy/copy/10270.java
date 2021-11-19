public java.lang.String[] getCategoryMembers(java.lang.String name, boolean subcat, int... ns) throws java.io.IOException {
    return getCategoryMembers(name, (subcat ? 1 : 0), new java.util.ArrayList<java.lang.String>(), ns);
}