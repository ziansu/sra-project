public void setCardBackBackground(@android.support.annotation.DrawableRes
int cardBackBackground) {
    mCardBackBackground = cardBackBackground;
    setBackgroundResource(mCardBackBackground);
    redrawViews();
}