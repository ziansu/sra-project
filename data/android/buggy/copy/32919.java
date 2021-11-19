void addNote(org.opentripplanner.routing.graph.Edge edge, org.opentripplanner.routing.alertpatch.Alert note, org.opentripplanner.routing.services.notes.NoteMatcher matcher) {
    if (org.opentripplanner.routing.services.notes.StaticStreetNotesSource.LOG.isDebugEnabled())
        org.opentripplanner.routing.services.notes.StaticStreetNotesSource.LOG.debug("Adding note {} to {} with matcher {}", note, edge, matcher);
    
    notesForEdge.put(edge, buildMatcherAndAlert(matcher, note));
}