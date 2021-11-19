public void brickTapSetter() {
    if ((brickHealth) > 0) {
        (brickTapCount)++;
        brickView.setText(("" + (brickTapCount)));
    }
}