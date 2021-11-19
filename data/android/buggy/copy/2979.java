@java.lang.Override
public com.example.liujiachao.zhihudaily.StoryExtra parseNetworkResponse(okhttp3.Response response, int id) throws java.lang.Exception {
    com.example.liujiachao.zhihudaily.StoryExtra storyExtra;
    storyExtra = com.example.liujiachao.zhihudaily.Json.parseStoryExtra(response.body().string());
    return storyExtra;
}