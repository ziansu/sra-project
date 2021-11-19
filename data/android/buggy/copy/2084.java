public void reset() {
    lastPicksSize = 0;
    for (com.mayhew3.drafttower.server.TeamDraftOrder team : predictionsByTeam.keySet()) {
        predictionsByTeam.get(team).clear();
    }
}