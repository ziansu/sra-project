@java.lang.Override
public int compare(java.lang.Integer i1, java.lang.Integer i2) {
    int rank1 = sortedRanks[i1][selectedWeight];
    int rank2 = sortedRanks[i2][selectedWeight];
    return rank1 < rank2 ? -1 : rank1 > rank2 ? 1 : 0;
}