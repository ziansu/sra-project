@java.lang.SuppressWarnings(value = "static-method")
private void testSubstanceATP(final org.mcisb.ontology.pubchem.OntologyTerm ontologyTerm) throws java.lang.Exception {
    org.mcisb.ontology.pubchem.Assert.assertTrue(ontologyTerm.getSynonyms().contains("Adenosine 5'-(tetrahydrogen triphosphate)"));
    org.mcisb.ontology.pubchem.Assert.assertTrue(ontologyTerm.getName().equals("Adenosine triphosphate"));
}