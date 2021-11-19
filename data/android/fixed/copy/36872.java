@java.lang.Override
public void onClick(android.view.View view) {
    new com.example.android.popularmoviesstagetwo.tasks.ManageFavouritesAsyncTask(getActivity(), favouriteButton, movieDetails, true).execute();
}