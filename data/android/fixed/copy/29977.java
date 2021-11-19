private void randomImg(android.widget.ImageView imageView) {
    int num = mRandom.nextInt(6);
    mCount += num + 1;
    imageView.setImageResource(mImgs[num]);
}