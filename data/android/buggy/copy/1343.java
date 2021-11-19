public void setUpGameLevel(net.cloudhacking.androidgame2.SceneInfo sceneInfo) {
    mLevel = new net.cloudhacking.androidgame2.GameLevel(sceneInfo);
    setArenaSize(mLevel.getLevelSize());
}