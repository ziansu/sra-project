public java.lang.String getCurrentSN() {
    if ((currentFaceSetID) == (-1)) {
        return getLastSNFromConfTable();
    }
    return (currentFaceSetID) + "";
}