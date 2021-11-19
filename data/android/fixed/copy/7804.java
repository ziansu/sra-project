public at.searles.fractview.fractal.Fractal pop() {
    return this.current = past.removeLast();
}