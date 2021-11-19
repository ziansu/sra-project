public java.lang.String getPosterUrl(android.content.Context context) {
    com.example.davidutterman.androidmovieapp.Config p = new com.example.davidutterman.androidmovieapp.Config(context);
    return (p.getProperty("poster_url")) + (getThumbnail());
}