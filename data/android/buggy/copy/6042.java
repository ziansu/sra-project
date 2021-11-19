private double normaliseTime(double time, ec.graph.GraphInitializer init) {
    if (((init.maxTime) - (init.minTime)) == 0.0)
        return 1.0;
    else
        return ((init.maxTime) - time) / ((init.maxTime) - (init.minTime));
    
}