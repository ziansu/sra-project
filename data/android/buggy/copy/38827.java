public com.danimahardhika.cafebar.CafeBar.Builder icon(@android.support.annotation.DrawableRes
int res, boolean tintIcon) {
    mIcon = com.danimahardhika.cafebar.CafeBarUtil.getDrawable(mContext, res);
    mTintIcon = tintIcon;
    return this;
}