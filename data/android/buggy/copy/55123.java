public net.straylightlabs.tivolibre.PesHeader.StartCode getUnfinishedStartCode() {
    if ((incompleteStartCode) == null) {
        throw new java.lang.IllegalStateException("Cannot get incompleteStartCode when it is null");
    }
    return incompleteStartCode;
}