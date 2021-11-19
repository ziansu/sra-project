public void setCaption(java.lang.String caption) {
    inflate();
    mCaption.setText(sanitizeText(caption));
    show();
    invalidate();
}