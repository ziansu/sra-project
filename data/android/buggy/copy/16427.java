public org.rajawali3d.ATransformable3D setRotation(double x, double y, double z, double angle) {
    mOrientation.multiply(mTmpOrientation.fromAngleAxis(x, y, z, angle));
    mLookAtValid = false;
    markModelMatrixDirty();
    return this;
}