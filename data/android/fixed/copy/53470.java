public Messages.Message getLastMessage(java.lang.String node) {
    int size = NodeMessageHistoryMap.get(node).size();
    return NodeMessageHistoryMap.get(node).get((size - 1));
}