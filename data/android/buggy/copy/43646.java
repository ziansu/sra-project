@org.junit.Test
public void Set_Id() {
    recipesModel.setId(1);
    org.junit.Assert.assertEquals(((int) (recipesModel.getId())), 1);
}