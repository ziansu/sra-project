@java.lang.Override
public geometry.Vec2 getCenter(boolean includeScale) {
    return includeScale ? geometry.Vec2.mult(center, scale) : center;
}