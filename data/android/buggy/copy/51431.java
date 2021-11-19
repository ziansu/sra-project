public structures.Node findRepresentative() {
    structures.Node rep = this.representative;
    while (rep != (rep.representative)) {
        rep = rep.findRepresentative();
    } 
    return rep;
}