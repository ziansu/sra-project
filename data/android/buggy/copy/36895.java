private void sortDataPoints() {
    if (!(dataPointsDirty)) {
        return ;
    }
    java.util.Collections.sort(com.hardcoders.csc468.weather.graph.LineGraph.getDataPoints());
    dataPointsDirty = false;
    scalesDirty = true;
}