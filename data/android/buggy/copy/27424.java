public void resetCommands() {
    for (application.models.playerAsset.Army a : armyList) {
        if ((a.getUnits().size()) == 0) {
            this.decommission(a.assetID);
        }
        a.resetCommands();
    }
}