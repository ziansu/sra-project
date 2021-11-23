@java.lang.Override
public void saveMoviesToRealm(java.util.List<com.example.filip.movielist.pojo.MovieListModel> listOfMovies) {
    mRealmInstance.beginTransaction();
    mRealmInstance.copyToRealmOrUpdate(listOfMovies);
    mRealmInstance.commitTransaction();
}