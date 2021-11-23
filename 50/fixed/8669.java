public void afterBurnin() {
    if ((nuMove) != null) {
        nuMove.alwaysSample();
        nuMove.setMinValue(0.001);
    }
}