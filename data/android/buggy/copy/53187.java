@java.lang.Override
public void setPosition(final long pos, final int d) {
    final long distance = ((position[d]) - (currentOffset[d])) - pos;
    move(distance, d);
}