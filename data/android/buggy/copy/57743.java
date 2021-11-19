@java.lang.Override
public void onFailure(retrofit2.Call<okhttp3.ResponseBody> call, java.lang.Throwable throwable) {
    finishOneRequest();
    com.phicdy.mycuration.rss.UnreadCountManager.getInstance(context).refreshConut(feed.getId());
    context.sendBroadcast(new android.content.Intent(com.phicdy.mycuration.task.NetworkTaskManager.FINISH_UPDATE_ACTION));
}