private void privateConstructor(android.content.Context context) {
    mMatrix.set(getImageMatrix());
    setBackgroundColor(Color.BLACK);
    super.setScaleType(ScaleType.MATRIX);
    super.setLongClickable(false);
    setClickable(true);
}