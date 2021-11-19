static int getNewUniqueLoaderId() {
    return com.example.android.app.moviesapp.Generator.sCurrentUniqueId.getAndIncrement();
}