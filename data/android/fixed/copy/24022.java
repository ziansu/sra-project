public void setVerticalInterval(float interval) {
    mVerticalInterval = ((int) (dp2px(getContext(), interval)));
    postInvalidate();
}