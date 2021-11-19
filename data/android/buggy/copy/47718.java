java.lang.Integer getInitialPartitionId() {
    return io.vntr.utils.ProbabilityUtils.getRandomElement(partitions.keySet());
}