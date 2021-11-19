public static float getRealDistance(float prevDistance, float speed, long deltaTime) {
    float dist = prevDistance + ((speed * deltaTime) / ((60 * 60) * 1000));
    if (dist < prevDistance) {
    }
    return dist;
}