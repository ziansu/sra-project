public void reset() {
    this.dist = 0;
    this.flag = false;
    this.pi = this.p;
    this.pis.put(this.p, new VoronoiDiagram.Generator(this.p, 0, 0));
}