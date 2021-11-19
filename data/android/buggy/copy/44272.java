public java.util.List<edu.cwru.sepia.agent.minimax.GameStateChild> orderChildrenWithHeuristics(java.util.List<edu.cwru.sepia.agent.minimax.GameStateChild> children) {
    children = insertionSort(children);
    return children;
}