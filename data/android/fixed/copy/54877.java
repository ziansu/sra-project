@org.testng.annotations.Test
public void testGetMatchedByNameWhenNameIsNull() {
    java.util.List<org.jtalks.common.model.entity.Group> listAll = dao.getAll();
    @java.lang.SuppressWarnings(value = { "NullableProblems" })
    java.util.List<org.jtalks.common.model.entity.Group> listReturned = dao.getMatchedByName(null);
    org.testng.Assert.assertEquals(listAll, listReturned);
}