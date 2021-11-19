@org.junit.Test
public void GuessesAWhenAIsThereAreAsInTheClueAsWell() {
    com.hangman.players.YourPlayer player = new com.hangman.players.YourPlayer();
    char guess = player.GetGuess(java.util.Arrays.asList('_', 'a', '_'));
    org.junit.Assert.assertEquals('a', guess);
}