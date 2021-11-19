@javax.persistence.Transient
public java.util.List<mgi.frontend.datamodel.VocabChild> getEmapParentEdges() {
    java.util.List<mgi.frontend.datamodel.VocabChild> emapParentEdges = new java.util.ArrayList<mgi.frontend.datamodel.VocabChild>(this.getParentEdges());
    java.util.Collections.sort(emapParentEdges, new mgi.frontend.datamodel.VocabTerm.EmapParentEdgeComparator());
    return emapParentEdges;
}