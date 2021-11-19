public static void set(int row, int col, double val) {
    Tuple<java.lang.Integer, java.lang.Integer> t = new Tuple<java.lang.Integer, java.lang.Integer>(row, col);
    SparseMatrix.mat.put(t, val);
    return ;
}