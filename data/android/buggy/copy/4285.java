@org.junit.Test
public void addRecipe8() {
    mocha = new edu.pjatk.inn.coffeemaker.impl.Recipe();
    mocha.setName("Mocha");
    mocha.setPrice(java.lang.Integer.parseInt("a"));
    org.junit.Assert.assertFalse(coffeeMaker.addRecipe(coffee));
}