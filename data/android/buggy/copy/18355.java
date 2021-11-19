@org.junit.Test
public void addRecipe9() {
    mocha = new edu.pjatk.inn.coffeemaker.impl.Recipe();
    mocha.setName("Mocha");
    mocha.setPrice(60);
    mocha.setAmtCoffee(java.lang.Integer.parseInt("a"));
    org.junit.Assert.assertFalse(coffeeMaker.addRecipe(coffee));
}