public java.lang.String[] GetKeysByOrder(java.lang.String fName, java.lang.String section) {
    return this.GetKeysByOrder(fName, section, "DESC", java.lang.String.valueOf(java.lang.Integer.MAX_VALUE), "0");
}