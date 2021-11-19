public static java.util.Set<java.lang.String> getFacets() {
    return asSet(org.semanticweb.owlapi.vocab.OWLFacet.stream().map(( v) -> v.getSymbolicForm()));
}