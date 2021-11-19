public void removeRenderable(tech.kodiko.jgl2d.graphics.Renderable r) {
    synchronized(this) {
        this.renderables.remove(r);
    }
}