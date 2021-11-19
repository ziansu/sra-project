@org.junit.Test
public void testGameURL() {
    item = parser.parse(gameURL);
    printItemValues(item);
    checkItem(gameTitle, gamePrice, "1");
}