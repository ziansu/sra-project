private void pauseChart() {
    this.chartComponent.pause(true, true);
    this.setPauseImage(this.playPauseImage, this.context);
}