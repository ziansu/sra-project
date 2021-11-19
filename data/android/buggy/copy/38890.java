@java.lang.Override
public boolean subscribe(java.lang.String channel) {
    return updateSubscriptions(channels.add(channel));
}