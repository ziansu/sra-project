public void writeGroup(int perGameId, java.lang.String type) {
    mwspaces.Group g = new mwspaces.Group("g", getAgent(perGameId), type, clock);
    java.lang.System.out.println(("CT writes setGoal: " + (g.toString())));
    createEntry(g);
}