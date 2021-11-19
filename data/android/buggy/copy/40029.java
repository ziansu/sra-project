public org.rajawali3d.ATransformable3D setRotZ(double rotZ) {
    mTmpOrientation.setAll(mOrientation);
    mOrientation.fromEuler(mTmpOrientation.getYaw(false), rotZ, mTmpOrientation.getRoll(false));
    mLookAtValid = false;
    markModelMatrixDirty();
    return this;
}