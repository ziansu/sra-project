public boolean creatObject(java.lang.String name, java.lang.String modelPath, int coordinateSystemID) {
    view.queueEvent(new gameSystem.gameObjectSystem.ObjectCreator(sdk, modelPath, coordinateSystemID, objects, OIR.getSoldierInfoByName(name)));
    return false;
}