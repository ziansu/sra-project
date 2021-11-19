public Utility.Vec2i getHex(boolean offset) {
    return new Utility.Vec2i((offset && ((x) != 0) ? (y) + 1 : y), x);
}