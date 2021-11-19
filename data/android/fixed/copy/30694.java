@java.lang.Override
public int getItemCount() {
    return (mData.size()) + ((mState) > (com.meetferrytan.popularmovies.presentation.global.ErrorLoadingViewHolder.STATE_NORMAL) ? 1 : 0);
}