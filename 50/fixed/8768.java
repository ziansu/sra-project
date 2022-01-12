private void notifyChangedLessonRange(int changedPosition) {
    if (mLatestLessonFirst)
        notifyItemRangeChanged(0, changedPosition);
    else {
        notifyItemChanged(0);
        notifyItemRangeChanged(changedPosition, ((getItemCount()) - changedPosition));
    }
}