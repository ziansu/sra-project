@java.lang.Override
protected double doRank(java.lang.String target, ltf.namerank.rank.RankConfig config) {
    double rk = 0;
    for (java.lang.String word : allCases(target))
        rk += super.doRank(target, config);
    
    return rk;
}