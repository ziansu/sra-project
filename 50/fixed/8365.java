private void privateConstructor() {
    mMatrix.set(getImageMatrix());
    super.setScaleType(ScaleType.MATRIX);
    super.setLongClickable(false);
    setClickable(true);
}