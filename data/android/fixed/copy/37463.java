private double computeConfidence() {
    if ((conceptCardinality) == 0)
        return 0;
    
    return (individualCardinality) / (conceptCardinality);
}