public com.jared.waves.units.Wave reflect(com.jared.waves.units.Wave w) {
    com.badlogic.gdx.math.Vector2 waveVector = w.getVector();
    java.lang.System.out.println(perpendicular.angle(waveVector));
    return w;
}