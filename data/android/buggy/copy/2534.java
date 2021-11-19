@java.lang.Override
public int computePartitionNo(java.lang.String key, int partitionCount) {
    if (key == null) {
        return (m_random.nextInt()) % partitionCount;
    }else {
        return (key.hashCode()) % partitionCount;
    }
}