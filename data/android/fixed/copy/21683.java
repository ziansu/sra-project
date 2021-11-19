public com.jme3.math.Vector3f project(com.jme3.math.Vector3f other) {
    float n = this.dot(other);
    float d = other.lengthSquared();
    return new com.jme3.math.Vector3f(other).multLocal((n / d));
}