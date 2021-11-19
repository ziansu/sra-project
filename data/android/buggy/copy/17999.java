public void setTickMarkCount(int tickMarkCount) {
    discreteSliderBackdrop.setTickMarkCount(tickMarkCount);
    discreteSliderBackdrop.invalidate();
    discreteSeekBar.setTickMarkCount(tickMarkCount);
    discreteSeekBar.invalidate();
}