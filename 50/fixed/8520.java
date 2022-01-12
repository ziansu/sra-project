public void go() {
    try {
        ranker = new ltf.namerank.rank.AllCasesRanker().add(new ltf.namerank.rank.dictrank.support.dict.HanYuDaCidian());
        doRanking();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}