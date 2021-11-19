public dna.features.SparseVector getACopy() {
    dna.features.SparseVector copy = new dna.features.SparseVector();
    copy.setHoldingHashTable(ST);
    copy.setCurrentIndex(currentIndex);
    return copy;
}