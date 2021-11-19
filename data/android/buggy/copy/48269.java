public utility.UndirectedGraphNode cloneGraph(utility.UndirectedGraphNode node) {
    return cloneGraphRecurse(node, new java.util.HashMap<java.lang.Integer, utility.UndirectedGraphNode>());
}