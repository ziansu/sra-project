public io.netty.channel.Channel reset(io.netty.channel.Channel channel, org.kde.kdeconnect.Backends.LanBackend.LanLink.ConnectionStarted connectionSource, boolean onSsl) {
    io.netty.channel.Channel oldChannel = this.channel;
    this.channel = channel;
    this.connectionSource = connectionSource;
    return oldChannel;
}