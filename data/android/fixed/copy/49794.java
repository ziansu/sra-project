public boolean creatObject(java.lang.String name, java.lang.String modelPath, int coordinateSystemID, gameSystem.gameObjectSystem.IDType id) {
    view.queueEvent(new gameSystem.gameObjectSystem.ObjectCreator(sdk, modelPath, coordinateSystemID, objects, OIR.getSoldierInfoByName(name), id));
    return false;
}