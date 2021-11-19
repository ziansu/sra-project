private void nameRanking(java.lang.String givenName) {
    ltf.namerank.lab.RankItem item = new ltf.namerank.lab.RankItem(givenName);
    ranker.rank(item);
    rankItems.add(item);
}