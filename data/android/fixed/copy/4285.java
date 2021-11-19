@org.junit.Test
public void addRecipe8() {
    mocha = new edu.pjatk.inn.coffeemaker.impl.Recipe();
    mocha.setName("Mocha");
    mocha.setPrice("a");
    org.junit.Assert.assertFalse(coffeeMaker.addRecipe(mocha));
}