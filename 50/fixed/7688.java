@org.junit.Test
public void testGetCanMoveFasterTrue() {
    it.polimi.ingsw.cg_23.model.players.Alien alien = new it.polimi.ingsw.cg_23.model.players.Alien("dummy");
    assertTrue(alien.getCanMoveFaster());
}