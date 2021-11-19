@Test.Network.Test
public void hiveShouldHavePersonalRating10() {
    java.lang.String personalRating;
    Main.Containers.Boardgame game = games.get(20);
    personalRating = game.getPersonalRating();
    int rating = java.lang.Integer.valueOf(personalRating);
    assertEquals(10, rating);
}