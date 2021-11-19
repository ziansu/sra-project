@org.junit.Test
public void testSetState() {
    nl.group37.bejeweled.main.model.Combination x1 = combinationMaker();
    org.junit.Assert.assertEquals(Tile.State.NORMAL, x1.getState());
    x1.setState(Tile.State.FLAME);
    org.junit.Assert.assertEquals(Tile.State.FLAME, x1.getState());
}