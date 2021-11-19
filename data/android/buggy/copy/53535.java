private void startFilteredBlock(org.bitcoinj.core.FilteredBlock m) {
    currentFilteredBlock = m;
    (filteredBlocksReceived)++;
    if (((filteredBlocksReceived) % (org.bitcoinj.core.Peer.RESEND_BLOOM_FILTER_BLOCK_COUNT)) == ((org.bitcoinj.core.Peer.RESEND_BLOOM_FILTER_BLOCK_COUNT) - 1)) {
        sendMessage(vBloomFilter);
    }
}