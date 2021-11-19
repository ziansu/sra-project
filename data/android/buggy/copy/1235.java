public void setSelectedTerritory(com.sonsofhesslow.games.risk.model.Territory touchedTerritory) {
    com.sonsofhesslow.games.risk.model.Risk.RiskChangeEvent riskChangeEvent = new com.sonsofhesslow.games.risk.model.Risk.RiskChangeEvent(com.sonsofhesslow.games.risk.model.Risk.RiskChangeEvent.EventType.SELECTED, this, touchedTerritory, this.selectedTerritory);
    setChanged();
    notifyObservers(riskChangeEvent);
    selectedTerritory = touchedTerritory;
}