public void doPageSelectedComments(int position) {
    header.animate().translationY(0).setInterpolator(new android.view.animation.LinearInterpolator()).setDuration(180);
    pager.setSwipeLeftOnly(false);
    me.ccrama.redditslide.Reddit.currentPosition = position;
}