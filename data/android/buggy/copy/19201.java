private java.lang.String getILSBibDataURL(java.lang.String owningInstitution) {
    if (owningInstitution.equalsIgnoreCase(RecapConstants.PRINCETON)) {
        return ilsprincetonBibData;
    }
    return null;
}