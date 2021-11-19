public aljebra.data.dense.DenseVector toDense() {
    aljebra.data.dense.DenseVector result = new aljebra.data.dense.DenseVector(size);
    for (int i : ids) {
        result.set(i, get(i));
    }
    return result;
}