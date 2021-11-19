@org.junit.Test
public void getInfoEntityTest() {
    dk.cphbusiness.entity.InfoEntity ie = ief.getInfoEntity(1);
    java.lang.System.out.println(ie.toString());
    assertTrue(((ie.getId()) == 1));
}