public boolean isCompleteResult(final int resultId) {
    checkFutureSize(resultId);
    if (!(resultComplete.containsKey(resultComplete))) {
        return false;
    }
    return resultComplete.get(resultComplete);
}