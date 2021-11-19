public void addsubpart(int n) {
    br.usp.ep1.dsid.Part p = this.currPart.clone();
    p.setQuant(n);
    this.currPart.getSubPart().add(p);
}