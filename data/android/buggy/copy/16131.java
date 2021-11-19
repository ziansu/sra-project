@javax.persistence.Transient
public java.util.List<mgi.frontend.datamodel.VocabChild> getEmapParentEdges() {
    java.util.List<mgi.frontend.datamodel.VocabChild> emapParentEdges = this.getParentEdges();
    java.util.Collections.sort(emapParentEdges, new mgi.frontend.datamodel.VocabTerm.EmapParentEdgeComparator());
    return emapParentEdges;
}