@java.lang.Override
public void onRequestSuccess(java.util.Map<de.christinecoenen.code.programguide.model.Channel, de.christinecoenen.code.programguide.model.Show> shows) {
    onRequestSuccess(shows.get(channel));
    de.christinecoenen.code.programguide.Cache.getInstance().save(shows);
}