@org.junit.Test
public void testIncreaseMovieRankingExceedTop() {
    com.example.user.movierankings.Ranking rankings = new com.example.user.movierankings.Ranking(movies);
    rankings.changeMovieRanking(movie4, 4);
    junit.framework.Assert.assertEquals(movie4.toString(), rankings.getMovieByRank(4).toString());
}