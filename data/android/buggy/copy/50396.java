private boolean isImageSizeRatioValid() {
    float imageSizeRatio = getImageSizeRatio();
    return (imageSizeRatio >= (mMinimumRatio)) && (imageSizeRatio <= (mMaximumRatio));
}