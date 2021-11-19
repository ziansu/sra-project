public void setSettlement(int newSettlement) {
    currentSettlement = settlementList.get((newSettlement - 1));
    currentBuildingList = currentSettlement.getBuildings();
    placedBuildingList = currentSettlement.getPlacedBuildings();
    updateButtonDisplay();
}