public components.Rotation plus(components.Rotation r) {
    return util.Util.reduceRotation(((components.Rotation) (super.plus(((components.Vector) (r))))));
}