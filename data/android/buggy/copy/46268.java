public double remove(int attribute, int mass) {
    productOfCardinalities = mzoom.Suspiciousness.productOfCardinalities(cardinalities);
    (cardinalities[attribute])--;
    this.mass -= mass;
    return density(this.mass, productOfCardinalities);
}