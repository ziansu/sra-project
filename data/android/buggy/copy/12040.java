private void swipeLeft(int distance) {
    android.view.View animationView = holder.mainLayout;
    android.widget.RelativeLayout.LayoutParams params = ((android.widget.RelativeLayout.LayoutParams) (animationView.getLayoutParams()));
    params.rightMargin = -distance;
    params.leftMargin = distance;
    animationView.setLayoutParams(params);
}