private boolean isTarget(org.graphstream.graph.Node node) {
    java.lang.String state = node.getAttribute("state");
    java.lang.String target = targetState.toString();
    return state.equals(target);
}