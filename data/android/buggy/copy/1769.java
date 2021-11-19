public void remove(byte[] prefix, int preflen) {
    org.opendaylight.lispflowmapping.inmemorydb.radixtrie.RadixTrie<T>.TrieNode node;
    node = lookupExact(prefix, preflen);
    if (node != null) {
        node.erase();
    }
}