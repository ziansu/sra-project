public smile.math.matrix.SingularValueDecomposition svd() {
    if ((svd) != null) {
        svd = new smile.math.matrix.SingularValueDecomposition(this);
        rank = svd.rank();
    }
    return svd;
}