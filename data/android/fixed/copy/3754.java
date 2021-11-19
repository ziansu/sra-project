@retrofit2.http.GET(value = ((((("services/rest/?" + ((("format=json" + "&nojsoncallback=1") + "&extras=url_s") + "&method=")) + (com.rpham64.android.photogallery.network.CoreApi.METHOD_SEARCH)) + "&api_key=") + (com.rpham64.android.photogallery.network.CoreApi.API_KEY)) + "&sort=") + (com.rpham64.android.photogallery.network.CoreApi.SORT_RELEVANCE))
rx.Observable<com.rpham64.android.photogallery.network.response.FlickrResponse> getPhotosBySearchRx(@retrofit2.http.Query(value = "page")
int page, @retrofit2.http.Query(value = "text")
java.lang.String query);