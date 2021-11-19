public com.github.nthportal.mathlib2.matrix.MatrixBuilder.VectorBuilder withValue(int index, int value) throws com.github.nthportal.mathlib2.matrix.MatrixIndexOutOfBoundsException {
    underlyingBuilder.withValue(index, 1, value);
    return this;
}