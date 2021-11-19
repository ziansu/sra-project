public void setTemporaryMax(int i) {
    if (i < 0) {
        i = java.lang.Integer.MAX_VALUE;
    }
    temporaryMax = i;
    current = max();
}