public void initialize() {
    for (int i = 0; i < (pop.length); i++) {
        NeuralNet n = new NeuralNet(1, 5, 5);
        setNum(n, i);
    }
}