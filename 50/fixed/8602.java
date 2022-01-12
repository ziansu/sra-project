public final void setCenteredRotation(final float degrees) {
    com.badlogic.gdx.math.Vector2 oldCenter = getCenter();
    setRotation(degrees);
    com.badlogic.gdx.math.Vector2 offset = dclib.geometry.VectorUtils.offset(getCenter(), oldCenter);
    translate(offset);
}