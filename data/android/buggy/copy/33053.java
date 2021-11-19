public float decelerate(float velocity) {
    velocity = com.theironyard.MyGdxGame.DECELERATION;
    if ((java.lang.Math.abs(velocity)) < 1) {
        velocity = 0;
    }
    return velocity;
}