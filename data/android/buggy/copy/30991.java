@Test.Network.Test
public void agricolaShouldHavePersonalRating8() {
    java.lang.String personalRating = "8";
    Main.Containers.Boardgame game = games.get(0);
    personalRating = game.getPersonalRating();
    int rating = java.lang.Integer.valueOf(personalRating);
    assertEquals(8, rating);
}