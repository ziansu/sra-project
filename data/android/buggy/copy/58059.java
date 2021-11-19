protected void manualFix() {
    mqttHelper.debug("Manual Fixing");
    if ((currentState) instanceof ev3steuerung.Maint)
        this.fix = true;
    
    mqttHelper.debug("Manual Fix Applied");
}