@org.junit.Test
public void setWeightWatcherSmartPoints() {
    recipeModel.setWeightWatcherSmartPoints(12);
    org.junit.Assert.assertEquals(((int) (recipeModel.getWeightWatcherSmartPoints())), 12);
}