@java.lang.Override
protected android.support.v4.view.ViewPropertyAnimatorCompat onAnimatedAdd(android.support.v7.widget.RecyclerView.ViewHolder holder) {
    return android.support.v4.view.ViewCompat.animate(holder.itemView).translationY(0).setInterpolator(mInterpolator).setStartDelay(((offsetDelay) * (holder.getLayoutPosition())));
}