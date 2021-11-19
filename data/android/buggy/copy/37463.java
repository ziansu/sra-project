private double computeConfidence() {
    if ((conceptCardinality) == 0)
        return 1;
    
    return (individualCardinality) / (conceptCardinality);
}