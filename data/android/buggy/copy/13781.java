@retrofit2.http.GET(value = "services/rest/?format=json&nojsoncallback=1&extras=url_s")
rx.Observable<com.rpham64.android.photogallery.network.response.FlickrResponse> getRecentPhotosRx(@retrofit2.http.Query(value = "page")
int page, @retrofit2.http.Query(value = "method")
java.lang.String method, @retrofit2.http.Query(value = "api_key")
java.lang.String key);