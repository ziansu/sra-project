@java.lang.Override
public void onFailure(retrofit2.Call<okhttp3.ResponseBody> call, java.lang.Throwable throwable) {
    finishOneRequest(feed.getId());
}