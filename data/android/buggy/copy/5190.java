public boolean isValidstaminaPoints(int staminaPoints) {
    if (staminaPoints < 0) {
        return false;
    }else
        if (staminaPoints > (this.getMaximumStaminaPoints())) {
            return false;
        }else {
            return true;
        }
    
}