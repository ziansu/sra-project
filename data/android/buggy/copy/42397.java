private int getNextConsumerIndex() {
    if (1 == (consumers.size())) {
        return 0;
    }
    return (java.lang.Math.abs(((count)++))) % (consumers.size());
}