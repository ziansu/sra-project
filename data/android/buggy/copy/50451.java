public void changeNodePath(com.mygdx.game.Map map, int xStart, int yStart) {
    currentPath = com.mygdx.game.MobPath.getRandomPathType();
    nodePath = com.mygdx.game.MobPath.createNodePath(map, currentPath, xStart, yStart);
    pathIndex = 0;
}