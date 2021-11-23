public void UpdatePower(double power) {
    if (power < 0)
        this.power = 0;
    else
        if (power > 120000)
            this.power = 120000;
        else
            this.power = power;
        
    
}