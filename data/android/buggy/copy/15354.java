public org.rajawali3d.ATransformable3D setRotX(double rotX) {
    mTmpOrientation.setAll(mOrientation);
    mOrientation.fromEuler(mTmpOrientation.getYaw(false), mTmpOrientation.getPitch(false), rotX);
    mLookAtValid = false;
    markModelMatrixDirty();
    return this;
}