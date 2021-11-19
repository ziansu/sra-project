@org.junit.Test
public void testSwitchPositions() {
    hu.unideb.inf.rydergaming.matchthree.model.Board br = new hu.unideb.inf.rydergaming.matchthree.model.Board();
    br.switchPositions(0, 0, 1, 0);
    assertEquals(4, br.getElement(0, 0));
}