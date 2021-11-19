public void setWorking(boolean isWorking) {
    this.isWorking = isWorking;
    carWash.setEndOfDay(isWorking);
    for (Pump p : fuelPumps)
        p.shutDown();
    
}