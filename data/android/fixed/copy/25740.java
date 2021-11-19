@org.junit.Test
public void testGameURL() {
    item = parser.parse(gameURL);
    checkItem(gameTitle, gamePrice, "1");
}