@org.junit.Test
public void Set_Instructions() {
    recipeModel.setInstructions("test");
    org.junit.Assert.assertEquals(recipeModel.getInstructions(), "test");
}