public engine_v01.assets.Vec2 divide(float s) {
    return s == 0 ? new engine_v01.assets.Vec2(0, 0) : new engine_v01.assets.Vec2(((x) / s), ((y) / s));
}