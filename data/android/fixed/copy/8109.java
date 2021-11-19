public datatypes.annotatedSentence.AnnotatedSentence link(datatypes.annotatedSentence.AnnotatedSentence as) {
    assignCandidates(as);
    evaluator.evaluate(as);
    return as;
}