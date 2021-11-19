public int getResourceId(java.lang.String layoutFile) {
    return getResources().getIdentifier(layoutFile, "xml", getPackageName());
}