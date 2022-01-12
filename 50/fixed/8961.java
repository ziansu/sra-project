public com.jme3.math.Vector3f projectLocal(com.jme3.math.Vector3f other) {
    float n = this.dot(other);
    float d = other.lengthSquared();
    return set(other).multLocal((n / d));
}