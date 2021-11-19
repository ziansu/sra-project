public void setTickMarkCount(int tickMarkCount) {
    this.tickMarkCount = tickMarkCount;
    discreteSliderBackdrop.setTickMarkCount(tickMarkCount);
    discreteSliderBackdrop.invalidate();
    discreteSeekBar.setTickMarkCount(tickMarkCount);
    discreteSeekBar.invalidate();
}