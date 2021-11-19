public edu.umd.marbl.mhap.impl.SequenceSketch createOffset(int offset) {
    return new edu.umd.marbl.mhap.impl.SequenceSketch(this.id.createOffset(offset), this.sequenceLength, this.mainHashes, this.orderedHashes);
}