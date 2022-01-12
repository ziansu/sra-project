@java.lang.Override
public void writeTo(final org.jboss.netty.buffer.ChannelBuffer data) {
    super.writeTo(data);
    data.writeInt(this.markerId);
    data.writeInt(this.markerType.getValue());
    this.markerData.writeTo(data);
}