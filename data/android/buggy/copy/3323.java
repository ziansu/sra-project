@org.junit.Test
public void fallInLava1() {
    mapUtils.loadMap("voleursg5");
    waitEndOfScripting();
    zildo.monde.sprites.persos.PersoPlayer zildo = spawnZildo(218, 133);
    simulateDirection(1, 0);
    renderFrames(2);
    checkScriptRunning("dieInPit");
}