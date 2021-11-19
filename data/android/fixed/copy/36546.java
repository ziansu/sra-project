public void fortify(Territory toTerritory, int units) {
    if ((this.getUnits()) > units) {
        this.removeUnits(units);
        toTerritory.addUnits(units);
    }
}