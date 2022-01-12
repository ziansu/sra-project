public static javax.vecmath.Matrix4d superposeAndTransform(javax.vecmath.Point3d[] fixed, javax.vecmath.Point3d[] moved) {
    org.biojava.nbio.structure.geometry.SuperPositions.superposer.setCentered(false);
    return org.biojava.nbio.structure.geometry.SuperPositions.superposer.superposeAndTransform(fixed, moved);
}