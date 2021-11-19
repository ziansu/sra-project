public void robotWaterLevelChange(int rate) {
    int val = waterLvl.get();
    val = val - ((severity) * 100);
    waterLvl.set(val);
}