public boolean isOverheatedAfterFiring() {
    return ((getTemperature()) + ((design.getHeatIncreasePerGunpowder()) * (getLoadedGunpowder()))) > (design.getCriticalTemperature());
}