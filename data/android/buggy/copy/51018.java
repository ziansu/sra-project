@java.lang.Override
public void displayTrailers(java.util.List<com.meetferrytan.popularmovies.data.entity.Trailer> trailers) {
    if ((trailers.size()) > 0) {
        mTrailerAdapter.setState(ErrorLoadingViewHolder.STATE_NORMAL);
        mTrailerAdapter.updateData(trailers);
    }else {
        mTrailerAdapter.setState(ErrorLoadingViewHolder.STATE_EMPTY);
    }
}