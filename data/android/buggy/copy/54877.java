@org.testng.annotations.Test
public void testGetMatchedByNameWhenNameIsNull() {
    java.util.List<org.jtalks.common.model.entity.Group> listAll = dao.getAll();
    java.util.List<org.jtalks.common.model.entity.Group> listReturned = dao.getMatchedByName(null);
    assertEquals(listAll, listReturned);
}