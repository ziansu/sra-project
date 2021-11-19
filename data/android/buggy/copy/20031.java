@org.junit.Test
public void Set_Vegetarian() {
    recipeModel.setVegetarian(true);
    org.junit.Assert.assertEquals(recipeModel.getVegetarian(), true);
}