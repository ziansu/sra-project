@javax.inject.Singleton
@dagger.Provides
android.net.ConnectivityManager provideConnectivityManager(com.danieldisu.dagger2intro.UserPreferencesManager userPreferencesManager) {
    return ((android.net.ConnectivityManager) (application.getSystemService(Context.CONNECTIVITY_SERVICE)));
}