public static com.hp.hpl.jena.rdf.model.Model withDefaultValueTypeInferences(com.hp.hpl.jena.rdf.model.Model model) {
    return com.hp.hpl.jena.rdf.model.ModelFactory.createModelForGraph(new com.hp.hpl.jena.graph.compose.MultiUnion(new com.hp.hpl.jena.graph.Graph[]{ model.getGraph() , org.topbraid.shacl.util.SHACLUtil.createDefaultValueTypesModel(model).getGraph() }));
}