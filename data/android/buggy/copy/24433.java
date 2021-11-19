org.jitsi.impl.neomedia.recording.RawPacket[] emptyBuffer(long ssrc) {
    org.jitsi.impl.neomedia.recording.PacketBuffer.Buffer buffer = buffers.get(ssrc);
    if (buffer != null) {
        return buffer.empty();
    }
    return new org.jitsi.impl.neomedia.recording.RawPacket[0];
}