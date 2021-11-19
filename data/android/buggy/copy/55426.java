@Test
public void Cd_instantiatesCorrectly_true() {
    Cd myCd = new Cd("Radiohead", "Okay Computer");
    assertEquals(true, (myCd instanceof Cd));
}