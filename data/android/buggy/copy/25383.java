public void removeRenderable(tech.kodiko.jgl2d.graphics.Renderable r) {
    synchronized(this.renderables) {
        this.renderables.remove(r);
    }
}