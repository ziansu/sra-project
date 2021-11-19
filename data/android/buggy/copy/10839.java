public void initialize(java.lang.String prefix) {
    m_recordmap = new java.util.HashMap<V, org.apache.mnemonic.collections.DurableSinglyLinkedList<V>>();
    readConfig(prefix);
    initNextPool();
}