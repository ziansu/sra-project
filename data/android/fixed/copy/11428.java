public void enter(@android.support.annotation.NonNull
android.widget.ImageView from, boolean withAnimation) {
    mImageFrom = from;
    mIsOpen = true;
    mAnimator.init(from, this);
    mAnimator.enter(withAnimation);
}