private android.widget.FrameLayout createFrameLayout(android.content.Context context) {
    android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
    frameLayout.setTag(null);
    frameLayout.setVisibility(com.wiky.ui.layout.INVISIBLE);
    frameLayout.setY(0.0F);
    return frameLayout;
}