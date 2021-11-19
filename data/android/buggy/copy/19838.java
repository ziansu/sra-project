public gl_own.Geometry.Vector2 interpolate(gl_own.Geometry.Vector2 start, gl_own.Geometry.Vector2 end, float t) {
    return gl_own.Geometry.Util.Add(gl_own.Geometry.Util.Mul(start, t), gl_own.Geometry.Util.Mul(end, (1 - t)));
}