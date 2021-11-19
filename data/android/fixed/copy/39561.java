public java.lang.Integer generateConnectionForNode(int mc, int node) {
    int q = app.generation.logics.RandomLogic.random.nextInt((mc + 1));
    while (q == node) {
        q = app.generation.logics.RandomLogic.random.nextInt((mc + 1));
    } 
    return q;
}