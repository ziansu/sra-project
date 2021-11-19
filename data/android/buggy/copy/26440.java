public com.yalantis.ucrop.UCrop withAspectRatio(float x, float y) {
    mCropOptionsBundle.putBoolean(com.yalantis.ucrop.UCrop.EXTRA_ASPECT_RATIO_SET, true);
    mCropOptionsBundle.putFloat(com.yalantis.ucrop.UCrop.EXTRA_ASPECT_RATIO_X, x);
    mCropOptionsBundle.putFloat(com.yalantis.ucrop.UCrop.EXTRA_ASPECT_RATIO_Y, y);
    return this;
}