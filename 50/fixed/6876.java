public java.util.Set<core.Circle> retrieve(core.Circle c) {
    return retrieve(quad.QuadTree.getRectangleFromCircle(c));
}