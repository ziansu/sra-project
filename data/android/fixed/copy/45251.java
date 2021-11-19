private boolean newNodeNameComesLater(java.lang.String newName) {
    if ((name.compareTo(newName)) < 0) {
        return true;
    }
    return false;
}