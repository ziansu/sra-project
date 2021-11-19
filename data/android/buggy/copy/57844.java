@java.lang.Override
public boolean unsubscribe(java.lang.String channel) {
    return updateSubscriptions(channels.remove(channel));
}