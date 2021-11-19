public int GetProcessedFeature(java.lang.String Feature) {
    int Result = 0;
    int ID = java.lang.Integer.parseInt(Feature);
    if (ID < (maxID)) {
        Result = ID;
    }
    return Result;
}