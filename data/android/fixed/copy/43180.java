@org.junit.Test
public void getInfoEntityTest() {
    dk.cphbusiness.entity.InfoEntity ie = ief.getInfoEntity(1);
    assertTrue(((ie.getId()) == 1));
}