public it.FedeWar.TrigonometricSeries.Math.Wave getWave(int id) {
    if ((id < (Waves.size())) && (id >= 0))
        return Waves.get(id);
    
    return null;
}