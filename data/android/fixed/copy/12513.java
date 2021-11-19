public static org.mwg.ml.common.matrix.Matrix multiply(org.mwg.ml.common.matrix.Matrix matA, org.mwg.ml.common.matrix.Matrix matB) {
    return org.mwg.ml.common.matrix.Matrix.defaultEngine().multiplyTransposeAlphaBeta(TransposeType.NOTRANSPOSE, 1.0, matA, TransposeType.NOTRANSPOSE, 1.0, matB);
}