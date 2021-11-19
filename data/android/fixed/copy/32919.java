void addNote(org.opentripplanner.routing.graph.Edge edge, org.opentripplanner.routing.alertpatch.Alert note, org.opentripplanner.routing.services.notes.NoteMatcher matcher) {
    notesForEdge.put(edge, buildMatcherAndAlert(matcher, note));
}