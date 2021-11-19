protected synchronized void removeLeftwards(android.view.View view, int position) {
    if (position != (android.support.v7.widget.RecyclerView.NO_POSITION)) {
        removeItem(position);
        animateOut(view, R.anim.slide_out_left, 150);
    }
}