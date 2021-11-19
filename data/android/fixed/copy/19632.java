@org.jetbrains.annotations.NotNull
private com.intellij.vcs.log.graph.collapsing.CollapsedGraph updateCollapsedGraph() {
    com.intellij.vcs.log.graph.utils.UnsignedBitSet initVisibility = com.intellij.vcs.log.graph.impl.facade.ReachableNodes.getReachableNodes(myPermanentGraphInfo.getLinearGraph(), myIdsOfVisibleBranches);
    return com.intellij.vcs.log.graph.collapsing.CollapsedGraph.newInstance(getDelegateController().getCompiledGraph(), initVisibility);
}