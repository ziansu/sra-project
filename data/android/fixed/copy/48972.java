public boolean creatObject(java.lang.String name, java.lang.String modelPath, int coordinateSystemID) {
    if (end)
        return false;
    
    view.queueEvent(new gameSystem.gameObjectSystem.ObjectCreator(sdk, modelPath, coordinateSystemID, objects, OIR.getSoldierInfoByName(name)));
    return false;
}