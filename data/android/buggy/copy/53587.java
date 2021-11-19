public java.util.TreeSet<hudson.model.IViewEntry> getFailingJobs() {
    computePassingAndFailingJobs();
    if ((failing.size()) > 0) {
        return failing;
    }
    return unstable;
}