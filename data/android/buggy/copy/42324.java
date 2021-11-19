public final void setGraphSize(final int newGraphSize) {
    graphSize = newGraphSize;
    if ((graphSize) > 0) {
        centerGraphPosition(0, graphSize);
        zoomGraphToFit(graphSize);
    }
}