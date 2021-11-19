@java.lang.Override
public int capacity(int partitionNo) {
    if (partitionNo > 0) {
        throw new java.lang.IllegalArgumentException((("Invalid Partition Number " + partitionNo) + " specified."));
    }
    return buffer.length;
}