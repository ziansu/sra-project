@java.lang.Override
public void update(float deltaTime) {
    setTargets();
    fireAllTowers();
    updateBuildings();
    useBuildingPowers();
    checkWhitehouses();
}