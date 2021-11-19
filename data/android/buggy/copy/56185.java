public void createMagnets(final com.ait.lienzo.client.core.shape.wires.WiresShape shape) {
    shape.setMagnets(m_magnetManager.createMagnets(shape.getPath(), shape.getGroup(), com.ait.lienzo.client.core.util.Geometry.getCardinalIntersects(shape.getPath()), shape));
}