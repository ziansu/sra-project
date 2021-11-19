public com.brouding.simpledialog.SimpleDialog.Builder setGuideImage(@android.support.annotation.DrawableRes
int imageId, @android.support.annotation.IntRange
int padding) {
    this.guideImageId = imageId;
    this.guideImagePadding = getPXWithDP(padding);
    return this;
}