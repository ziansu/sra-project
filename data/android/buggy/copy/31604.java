public final void rotateZ(float degrees) {
    model.rotateAffine(((float) (java.lang.Math.toRadians(degrees))), position.x, position.y, position.z);
    rotation.add(0, 0, degrees);
}