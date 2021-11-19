public boolean hasDependency(hudson.model.Job src, hudson.model.Job dst) {
    return (getTransitiveUpstream(dst).contains(src)) || (getTransitiveDownstream(dst).contains(src));
}