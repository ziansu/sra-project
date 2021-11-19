public io.github.lizhangqu.fresco.FrescoLoader border(int borderColor, int borderWidth) {
    if ((this.mRoundingParams) == null) {
        this.mRoundingParams = new com.facebook.drawee.generic.RoundingParams();
    }
    this.mRoundingParams.setBorder(borderColor, borderWidth);
    return this;
}