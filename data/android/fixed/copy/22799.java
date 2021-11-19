@java.lang.Override
public int compareTo(gobblin.writer.AcknowledgableWatermark o) {
    return _checkpointableWatermark.compareTo(o._checkpointableWatermark);
}