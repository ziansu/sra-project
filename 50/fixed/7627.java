public synchronized void removeLeftwards(android.view.View view, int position) {
    if (position != (android.support.v7.widget.RecyclerView.NO_POSITION)) {
        animateOut(view, position, R.anim.slide_out_left, 150);
    }
}