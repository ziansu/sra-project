public void cool(boolean on) {
    if (on != (coolOn)) {
        hvac.cool(on);
        if (on == false)
            setFanCoolOff(3);
        
        coolOn = on;
    }
}