private double normaliseReliability(double reliability, ec.graph.GraphInitializer init) {
    if (((init.maxReliability) - (init.minReliability)) == 0.0)
        return 1.0;
    else
        return (reliability - (init.minReliability)) / ((init.maxReliability) - (init.minReliability));
    
}