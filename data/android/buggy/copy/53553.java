private de.neuenberger.serendipity.game.ResultTable createResultTable() {
    java.util.List<de.neuenberger.serendipity.game.Match> pairings = de.neuenberger.serendipity.game.Match.createPairings(java.util.Arrays.asList(t1, t2, t3, t4), de.neuenberger.serendipity.game.Consequence.values());
    de.neuenberger.serendipity.game.ResultTable resultTable = new de.neuenberger.serendipity.game.ResultTable(pairings);
    return resultTable;
}