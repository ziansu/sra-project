@java.lang.Override
public void done(java.util.List<com.timkranen.tmdb.domain.Movie> result) {
    ((com.example.myfavmov.MainActivity) (getActivity())).navigateToMovCollectionActivity(result);
}