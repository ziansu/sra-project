public Ponto2D somaPonto(double dx, double dy) {
    return new Ponto2D((x += dx), (y += dy));
}