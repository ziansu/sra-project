public void raiseEconomyBar(float amount) {
    if ((amount > 0) && ((amount + (com.gpteam.shopmanager.Economy.Economy.MAX_ECONOMY_BAR_VALUE)) <= (com.gpteam.shopmanager.Economy.Economy.MAX_ECONOMY_BAR_VALUE)))
        economyBar += amount;
    else
        com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler.handleIllegalArgumentException("msg");
    
}