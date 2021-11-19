@java.lang.Override
public void start(java.lang.String movieId, boolean shouldClean) {
    page = (shouldClean) ? 1 : (page)++;
    repository.getMovieComments(movieId, Repository.COMMENTS_SORT_NEWEST, limit, page, null, this);
}