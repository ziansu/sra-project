public boolean getModelValue(int x, int y) {
    return modelRep[yBathToModelRep(y)][xBathToModelRep(x)];
}