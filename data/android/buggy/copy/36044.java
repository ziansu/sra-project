public void channelClose(org.apache.sshd.common.util.Buffer buffer) throws java.io.IOException {
    org.apache.sshd.common.Channel channel = getChannel(buffer);
    channel.handleClose();
    unregisterChannel(channel);
}