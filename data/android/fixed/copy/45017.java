public components.Rotation plus(components.Rotation r) {
    return util.Util.reduceRotation(new components.Rotation(super.plus(((components.Vector) (r)))));
}