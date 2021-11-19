private double normaliseCost(double cost, ec.graph.GraphInitializer init) {
    if (((init.maxCost) - (init.minCost)) == 0.0)
        return 1.0;
    else
        return (cost - (init.minCost)) / ((init.maxCost) - (init.minCost));
    
}