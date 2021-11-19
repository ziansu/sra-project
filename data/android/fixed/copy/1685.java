public ontologizer.go.TermID[] getAlternatives() {
    if ((alternatives) == null)
        return null;
    
    ontologizer.go.TermID[] alts = new ontologizer.go.TermID[alternatives.size()];
    return alternatives.toArray(alts);
}