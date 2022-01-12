public void playOneSequence() {
    Montecarlo.Node node = selectNode(root);
    node = expand(node);
    if (node == null) {
        return ;
    }
    int winner = simulation(node);
    backPropagation(node, winner);
}