private void createRandomActions(base.ActionManager aManager) {
    for (int i = 0; i < (base.simpleTest.Launcher.numberOfCubes); i++) {
        aManager.addPhysicAction(new base.physics.NewBodyAction(i, 2));
    }
}