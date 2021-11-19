@org.junit.Test
public void setId() {
    recipesModel.setId(1);
    org.junit.Assert.assertEquals(((int) (recipesModel.getId())), 1);
}