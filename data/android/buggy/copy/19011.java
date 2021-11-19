@java.lang.Override
public boolean isConceptModified(ai.grakn.graph.internal.ConceptImpl concept) {
    return ((com.orientechnologies.orient.core.record.impl.ODocument) (concept.getVertex())).isDirty();
}