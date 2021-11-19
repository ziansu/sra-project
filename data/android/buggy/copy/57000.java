@org.junit.Test
public void testRemoveAll() {
    org.opendaylight.lispflowmapping.inmemorydb.radixtrie.RadixTrieTest.radixTrie4 = new org.opendaylight.lispflowmapping.inmemorydb.radixtrie.RadixTrie<java.lang.Integer>(32, true);
    addIp4Addresses(org.opendaylight.lispflowmapping.inmemorydb.radixtrie.RadixTrieTest.radixTrie4);
    org.opendaylight.lispflowmapping.inmemorydb.radixtrie.RadixTrieTest.radixTrie4.removeAll();
    org.junit.Assert.assertEquals(0, org.opendaylight.lispflowmapping.inmemorydb.radixtrie.RadixTrieTest.radixTrie4.getSize());
}