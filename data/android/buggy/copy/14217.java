@org.junit.Test
public void testPerformSpawnEnemy() {
    nl.tudelft.contextproject.util.webinterface.ActionUtil.perform(Action.SPAWNENEMY, 0, 0);
    org.mockito.Mockito.verify(mockedGame, org.mockito.Mockito.times(1)).addEntity(org.mockito.Matchers.any(nl.tudelft.contextproject.model.entities.KillerBunny.class));
}