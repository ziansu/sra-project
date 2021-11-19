public org.nschmidt.csg.Polygon transform(org.nschmidt.csg.Transform transform) {
    for (org.nschmidt.csg.Vector3d v : vertices) {
        transform.transform(v);
    }
    if (transform.isMirror()) {
        flip();
    }
    return this;
}