@com.mindorks.placeholderview.annotations.swipe.SwipeIn
private void onSwipeIn() {
    setVote("likes");
    tk.talcharnes.unborify.Utilities.Analytics.registerSwipe(mContext, "right");
}