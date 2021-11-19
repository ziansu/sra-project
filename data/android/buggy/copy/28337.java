@java.lang.Override
public void success(java.util.ArrayList<rocks.itsnotrocketscience.bejay.models.Event> eventList, retrofit.client.Response response) {
    listener.onEventFeedLoaded(eventList, null);
    rlError.setVisibility(View.VISIBLE);
}