public int toStringHelper(java.lang.String rep) {
    int iterations = 0;
    for (logic.Post p : posts) {
        rep += ("   " + (p.toString())) + ", \n";
        iterations++;
    }
    return iterations;
}