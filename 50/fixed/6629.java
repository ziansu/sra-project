public void registrarConfusao(knn.Classe expected, knn.Classe actual) {
    (this.matriz[((knn.Classe.toInt(expected)) - 1)][((knn.Classe.toInt(actual)) - 1)])++;
}