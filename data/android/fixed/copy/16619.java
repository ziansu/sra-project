public void lowerEconomyBar(float amount) {
    if (amount <= (economyBar))
        economyBar -= amount;
    else
        com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler.handleIllegalArgumentException("msg");
    
}