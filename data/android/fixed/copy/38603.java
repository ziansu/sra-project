protected int translateX(int screenX) {
    return java.lang.Math.round(com.badlogic.gdx.math.MathUtils.clamp((((float) (screenX - (offsetX))) / (cellWidth)), 0.0F, ((gridWidth) - 1.0F)));
}