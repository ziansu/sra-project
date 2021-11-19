public java.util.List<edu.cwru.sepia.agent.minimax.GameStateChild> orderChildrenWithHeuristics(java.util.List<edu.cwru.sepia.agent.minimax.GameStateChild> children) {
    if (children.isEmpty())
        return children;
    
    children = insertionSort(children);
    return children;
}