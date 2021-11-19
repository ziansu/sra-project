private void randomImg(android.widget.ImageView imageView) {
    int num = mRandom.nextInt(6);
    if (num == 0) {
        num = 1;
    }
    mCount += num;
    imageView.setImageResource(mImgs[(num - 1)]);
}