@org.junit.Test
public void addInventory7() {
    org.junit.Assert.assertFalse(coffeeMaker.addInventory(5, java.lang.Integer.parseInt("a"), 0, 0));
}