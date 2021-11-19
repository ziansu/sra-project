@java.lang.Override
public int compare(java.lang.Integer i1, java.lang.Integer i2) {
    int rank1 = sortedRanks[i1][selectedWeight];
    int rank2 = sortedRanks[i2][selectedWeight];
    return java.lang.Integer.compare(rank1, rank2);
}