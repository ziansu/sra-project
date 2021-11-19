@java.lang.Override
public void setFavoriteChannels(java.util.Set<java.lang.String> favoriteChannels) {
    if ((channelObserver) != null) {
        channelObserver.dispatchChange(false, null);
    }
}