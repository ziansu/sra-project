private org.geneontology.minerva.json.JsonOwlObject renderObject(org.semanticweb.owlapi.model.OWLClass cls) {
    java.lang.String id = org.geneontology.minerva.util.IdStringManager.getId(cls, graph);
    org.geneontology.minerva.json.JsonOwlObject json = org.geneontology.minerva.json.JsonOwlObject.createCls(id, getLabel(cls, id));
    return json;
}