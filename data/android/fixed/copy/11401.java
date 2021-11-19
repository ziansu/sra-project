public io.github.daveho.beatbox.Builder prepend(net.beadsproject.beads.core.UGen ugen) {
    this.ugen.addInput(ugen);
    return new io.github.daveho.beatbox.Builder(ac, ugen, this.map);
}