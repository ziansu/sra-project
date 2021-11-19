@org.junit.Test
public void constructorTest() {
    org.junit.Assert.assertEquals(("Antall Kort skal være " + (java.lang.Integer.toString(((ANTALL_KORT) - 1)))), ((ANTALL_KORT) - 1), kortStokk.getList().size());
}