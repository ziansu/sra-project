private float modelCoordYToCanvas(float y, float minY, float canvasDimension, float bDimension, float[] boundingBox) {
    return minY + (((y - (boundingBox[1])) / bDimension) * canvasDimension);
}