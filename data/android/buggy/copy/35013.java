@java.lang.Override
public eu.learnpad.ca.rest.data.collaborative.AnnotatedCollaborativeContentAnalyses find(java.lang.Class<eu.learnpad.ca.rest.data.collaborative.AnnotatedCollaborativeContentAnalyses> class1, java.lang.Integer valueOf) {
    em = emFactory.createEntityManager();
    return em.find(class1, valueOf);
}