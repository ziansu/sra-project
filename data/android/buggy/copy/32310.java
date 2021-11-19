public net.danielthompson.danray.structures.Transform Apply(net.danielthompson.danray.structures.Transform t) {
    net.danielthompson.danray.structures.Matrix4x4 matrix = _matrix.Multiply(t._matrix);
    net.danielthompson.danray.structures.Matrix4x4 inverse = _inverse.Multiply(t._inverse);
    return new net.danielthompson.danray.structures.Transform(matrix, inverse);
}