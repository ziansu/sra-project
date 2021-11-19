public org.rajawali3d.ATransformable3D setRotation(final org.rajawali3d.math.Matrix4 matrix) {
    mOrientation.multiply(mTmpOrientation.fromMatrix(matrix));
    mLookAtValid = false;
    markModelMatrixDirty();
    return this;
}