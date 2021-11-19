public double getElevation() {
    return model.ModelManager.getBattlefield().getMap().get(getContainerTilePos()).getModifiedElevation();
}