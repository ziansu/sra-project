@java.lang.Override
public int getRiskIntensity(int rank) {
    return com.badlogic.gdx.math.MathUtils.clamp(((coreIntensity) - (rank * 2)), 2, 10);
}