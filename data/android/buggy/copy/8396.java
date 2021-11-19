public void reset() {
    super.reset();
    path = new java.util.ArrayList<Agents.Node>();
    nodes = new java.util.HashMap<Agents.Node, Agents.Node>();
    pathNotCreatedYet = true;
    int searchSteps = 0;
    int movementSteps = 0;
}