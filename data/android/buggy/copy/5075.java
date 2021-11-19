public void changeLevel(com.custardgames.sudokil.utils.LevelData levelData) {
    assetManager.clear();
    loadAssets(assetManager, levelData);
    box2dWorldManager.clear();
    changeMap(levelData.getMapLocation());
    worldManager.dispose();
    worldManager.loadLevelData(levelData);
}