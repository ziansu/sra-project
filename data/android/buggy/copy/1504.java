public void velocityUpdate(double dt, Vector3D force) {
    velocity = Vector3D.vectorAddition(velocity, force.scalarMultiply((dt / (mass))));
}