public pt.it.av.atnog.utils.bla.Matrix transpose() {
    pt.it.av.atnog.utils.bla.Matrix T = new pt.it.av.atnog.utils.bla.Matrix(columns, rows);
    pt.it.av.atnog.utils.bla.Matrix.transpose(data, T.data, rows, columns);
    return T;
}