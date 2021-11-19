@java.lang.Override
public void onClick(android.view.View view) {
    if ((onStreamInfoItemSelectedListener) != null) {
        onChannelInfoItemSelectedListener.selected(info.serviceId, info.getLink(), info.channelName);
    }
}