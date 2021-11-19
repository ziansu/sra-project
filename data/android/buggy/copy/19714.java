public double[][] toneFlat(double hz, double duration, double buildIn, double buildOut, double volume, Waves.WaveType type) {
    return toneBend(hz, hz, 0, duration, buildIn, buildOut, volume, type);
}