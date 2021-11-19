public void setVelocity(org.lwjgl.util.vector.Vector3f v) {
    java.lang.System.out.printf("Velocity of ball %s set to: (%f|%f|%f)\n", this.toString(), v.x, v.y, v.z);
    currentVel.set(v.x, v.y, v.z);
}