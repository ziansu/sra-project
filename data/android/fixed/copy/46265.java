public static javax.vecmath.Matrix4d getTransformation(org.biojava.nbio.structure.jama.Matrix rot, org.biojava.nbio.structure.jama.Matrix trans) {
    return new javax.vecmath.Matrix4d(new javax.vecmath.Matrix3d(rot.getColumnPackedCopy()), new javax.vecmath.Vector3d(trans.getColumnPackedCopy()), 1.0);
}