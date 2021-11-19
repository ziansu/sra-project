public com.danimahardhika.cafebar.CafeBar.Builder icon(@android.support.annotation.Nullable
android.graphics.Bitmap icon, boolean tintIcon) {
    return icon(com.danimahardhika.cafebar.CafeBarUtil.toDrawable(mContext, icon), tintIcon);
}