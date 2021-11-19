public final void rotateZ(float degrees) {
    model.rotateZ(((float) (java.lang.Math.toRadians(degrees))));
    rotation.add(0, 0, degrees);
}