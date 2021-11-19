public boolean checkInterest(java.lang.Integer peerid) {
    java.util.BitSet neighbor_bits = this.interestingBits(peerid);
    FileHandle.logger.debug("Interested in pieces {} from peer {} (self={})", this.printableBitSet(neighbor_bits), peerid, this.myid);
    return !(neighbor_bits.isEmpty());
}