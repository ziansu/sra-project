public edu.emory.mathcs.nlp.component.dep.DEPArc copy(edu.emory.mathcs.nlp.component.dep.DEPNode node) {
    edu.emory.mathcs.nlp.component.dep.DEPArc depCopy = new edu.emory.mathcs.nlp.component.dep.DEPArc(node, getLabel());
    return depCopy;
}