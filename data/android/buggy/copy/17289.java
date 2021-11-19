public com.danimahardhika.cafebar.CafeBar.Builder buttonTypeface(java.lang.String fontName) {
    mNeutralTypeface = mPositiveTypeface = mNegativeTypeface = com.danimahardhika.cafebar.CafeBarUtil.getTypeface(mContext, fontName);
    return this;
}