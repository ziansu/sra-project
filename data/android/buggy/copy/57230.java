public java.lang.Boolean isPillStillAvailable(int pillIndex) {
    if (po) {
        int pillLocation = currentMaze.pillIndices[pillIndex];
        if (!(isNodeObservable(pillLocation))) {
            return null;
        }
    }
    return pills.get(pillIndex);
}