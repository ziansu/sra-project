public double scaleX(double coordinate) {
    return (factorX) * ((coordinate * (initRootWidth)) / (this.maxVertexWidth));
}