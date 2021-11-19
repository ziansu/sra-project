private void initMarginRect(android.graphics.Rect marginRect, android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
    if (marginLayoutParams != null) {
        marginRect.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
    }
}