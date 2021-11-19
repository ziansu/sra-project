private int getAmplifier(cg.group4.sensor.AccelerationState state) {
    for (cg.group4.game_logic.stroll.Stroll.Amplifier a : cg.group4.game_logic.stroll.Stroll.Amplifier.values()) {
        if ((a.cState) == state) {
            return a.cAmplifier;
        }
    }
    return 1;
}