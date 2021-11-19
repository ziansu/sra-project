@org.junit.Test
public void testReader() throws java.io.IOException {
    java.util.List<menu.HighScore> hslist = menu.HighScoreCreator.highscoreReader("testhighscorelog");
    org.junit.Assert.assertTrue(((hslist.size()) == 5));
}