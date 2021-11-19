public void moveView(int from, int to) {
    android.view.View view = getChildAt(from);
    removeViewAt(from);
    addView(view, to);
}