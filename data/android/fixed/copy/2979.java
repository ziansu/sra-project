@java.lang.Override
public com.example.liujiachao.zhihudaily.StoryExtra parseNetworkResponse(okhttp3.Response response, int id) throws java.lang.Exception {
    return com.example.liujiachao.zhihudaily.Json.parseStoryExtra(response.body().string());
}