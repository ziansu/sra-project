public sp.HashTrie.Node getOrAddNextNode(char symbol) {
    sp.HashTrie.Node nextNode = getNextNode(symbol);
    if (nextNode == null) {
        nextNode = new sp.HashTrie.Node();
        map.put(symbol, nextNode);
    }
    return nextNode;
}