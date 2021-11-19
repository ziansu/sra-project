@java.lang.Override
public int getIntrinsicHeight() {
    if ((mAnimationBackend) == null) {
        return INTRINSIC_DIMENSION_UNSET;
    }
    return mAnimationBackend.getIntrinsicHeight();
}