public double score(int bin) {
    double score = 1;
    if (node.parentsActive()) {
        if ((node.getBin()) == bin) {
            score = probability;
        }
    }
    return score;
}