protected void dispose(cartago.ArtifactId aid) throws cartago.OperationException {
    try {
        env.disposeArtifact(this.getCurrentOpAgentId(), id);
    } catch (java.lang.Exception ex) {
        throw new cartago.OperationException(("disposeArtifact failed: " + aid));
    }
}