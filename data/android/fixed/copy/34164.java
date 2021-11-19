public com.github.nthportal.mathlib2.matrix.MatrixBuilder.VectorBuilder withValue(int index, int value) throws com.github.nthportal.mathlib2.matrix.MatrixIndexOutOfBoundsException {
    underlyingBuilder.withValue(index, 0, value);
    return this;
}