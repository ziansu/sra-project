public void setVelocity(float x, float y, float z) {
    java.lang.System.out.printf("Velocity of ball %s set to: (%f|%f|%f)\n", this.toString(), x, y, z);
    currentVel.set(x, y, z);
}