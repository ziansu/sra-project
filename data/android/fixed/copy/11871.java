public double clearWater() {
    final double remove = waterLevel;
    waterLevel = 0.0;
    return remove;
}