public boolean setSpaces(java.util.LinkedList<java.lang.Short> zeSpace) {
    if (spacesToOccupy.isEmpty()) {
        for (java.lang.Short zeShort : zeSpace) {
            spacesToOccupy.add(zeShort);
        }
        return true;
    }
    return false;
}