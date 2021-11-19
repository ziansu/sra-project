public void gearDown() {
    if ((manualGearState) > 0) {
        (manualGearState)--;
    }else {
        manualGearState = 0;
    }
}