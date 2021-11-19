@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    listener.onEventFeedLoaded(null, error);
}