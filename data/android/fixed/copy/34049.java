@org.junit.Test
public void checkScoreComparator() {
    java.util.List<com.google.api.ads.adwords.keywordoptimizer.KeywordInfo> sortedKeywords = keywords.getListSortedByScore();
    org.junit.Assert.assertEquals(com.google.common.collect.ImmutableList.of(gammaInfo, alphaInfo, betaBroadInfo, betaInfo), sortedKeywords);
}