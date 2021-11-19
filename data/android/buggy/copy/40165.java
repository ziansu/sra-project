public engine.math.Vector3 getAimDirection(engine.math.Vector3 target) {
    return target.subtract(position);
}