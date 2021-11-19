private void setMutationCounter(org.optaplanner.core.impl.domain.solution.mutation.MutationCounter mutationCounter) {
    if ((this.mutationCounter) != null) {
        throw new java.lang.IllegalStateException((("Impossible state: mutationCounter (" + mutationCounter) + ") is not null."));
    }
    this.mutationCounter = mutationCounter;
}