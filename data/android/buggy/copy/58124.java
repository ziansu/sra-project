public Ai.Node getFirst() {
    Ai.Node temp = this;
    while ((this.lastNode) != null) {
        temp = temp.lastNode;
    } 
    return temp;
}