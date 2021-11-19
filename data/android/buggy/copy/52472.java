public void addPart(br.usp.ep1.dsid.Part p) {
    long id = (java.util.Collection.max(this.parts.keySet())) + 1;
    p.setId(id);
    this.parts.put(id, p);
}