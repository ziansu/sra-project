public static synchronized void addShape(io.github.simcards.simcards.client.graphics.Shape shape) {
    io.github.simcards.simcards.client.graphics.GLRenderer.shapes.add(shape);
    io.github.simcards.simcards.client.graphics.GLSurfaceViewWrapper.rerender();
}