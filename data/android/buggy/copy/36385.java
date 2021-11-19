public abstracts.Subject joinNode() {
    abstracts.Subject s = this.joinHelp();
    this.nodes.add(s);
    return s;
}