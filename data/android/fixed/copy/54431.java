@java.lang.Override
public bee.Solution getRandomSolution() {
    graph.Edge eStart = getRandomEdge();
    graph.Edge eEnd = getRandomEdge();
    java.lang.Long start = eStart.from;
    java.lang.Long end = eEnd.to;
    return new bee.trip.Path(start, end, this);
}