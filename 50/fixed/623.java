@java.lang.Override
public void run() {
    switch (showType) {
        case "movie" :
            setListingsAdapters(showType, mMoviesAdapter);
            break;
        case "tv" :
            setListingsAdapters(showType, mTvShowsAdapter);
            break;
    }
}