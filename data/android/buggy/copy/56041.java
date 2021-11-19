@java.lang.Override
public long skip(long bytes) throws java.io.IOException {
    lombok.val position = seekToBeginPosition();
    return position >= (end) ? 0 : super.skip(java.lang.Math.min(((end) - position), bytes));
}