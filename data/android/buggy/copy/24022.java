public void setVerticalInterval(float interval) {
    mVerticalInterval = co.lujun.androidtagview.Utils.dp2px(getContext(), interval);
    postInvalidate();
}