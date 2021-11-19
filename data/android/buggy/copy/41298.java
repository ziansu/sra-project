public java.util.ArrayList<org.semanticweb.owlapi.model.OWLAxiom> getSelectedAxioms() {
    selectedExistingAxioms.addAll(selectedNewAxioms);
    return selectedExistingAxioms;
}