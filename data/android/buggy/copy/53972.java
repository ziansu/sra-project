public void unassignAllFGColors() throws edu.brandeis.cs.nlp.mae.database.MaeDBException {
    java.util.List<java.lang.Integer> anchorLocations = getDriver().getAllAnchors();
    for (java.lang.Integer location : anchorLocations) {
        setFGColorAtLocation(java.awt.Color.black, location, false);
    }
}