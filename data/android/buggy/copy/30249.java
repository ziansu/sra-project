public boolean hasItem(java.lang.String aName) {
    aName = aName.toLowerCase();
    return (hash.get(aName)) != null;
}