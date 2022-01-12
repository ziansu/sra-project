@java.lang.Override
public boolean shouldBeScheduled() {
    return (isLinked(org.openhab.binding.plugwise.handler.CHANNEL_STATE)) || (isLinked(org.openhab.binding.plugwise.handler.CHANNEL_LAST_HOUR));
}