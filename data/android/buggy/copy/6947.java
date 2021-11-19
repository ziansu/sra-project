@retrofit2.http.GET(value = "videos")
retrofit2.Call<com.brighambangerter.ignapp.api.response.VideoResponse> getVideos(@retrofit2.http.Query(value = "startIndex")
int index);