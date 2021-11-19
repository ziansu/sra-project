public void addAxis(javax.vecmath.Matrix4d axis, int order, org.biojava.nbio.structure.symmetry.internal.CESymmParameters.SymmetryType type) {
    axes.add(new org.biojava.nbio.structure.symmetry.internal.SymmetryAxes.Axis(axis, order, type, axes.size(), 0));
}