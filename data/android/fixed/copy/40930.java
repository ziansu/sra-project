protected boolean checkValidPoint(Engine.Globals.GridPoint point) {
    return ((((point.row) >= 0) && ((point.row) < (mSize))) && ((point.column) >= 0)) && ((point.column) < (mSize));
}