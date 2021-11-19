public static int invert(double y, double max, double min) {
    return ((edu.utexas.cs.nn.graphics.Plot.BROWSE_DIM) - (2 * (edu.utexas.cs.nn.graphics.Plot.OFFSET))) - (edu.utexas.cs.nn.graphics.Plot.scale(y, max, min));
}