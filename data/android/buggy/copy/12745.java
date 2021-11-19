public void openCellWithFastAnimate(android.widget.ImageView imageView, int coordinate) {
    this.imageView = imageView;
    this.coordinate = coordinate;
    isFastAnimation = true;
    isMineAnimation = false;
    openCell();
    imageView.startAnimation(fastShrink);
}