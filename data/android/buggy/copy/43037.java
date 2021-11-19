public void writeGroup(int perGameId) {
    mwspaces.Group g = new mwspaces.Group("g", getAgent(perGameId), clock);
    java.lang.System.out.println(("CT writes setGoal: " + (g.toString())));
    createEntry(g);
}