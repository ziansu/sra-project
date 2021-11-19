private boolean hasEnoughRepo(processor.Candidate candidate) {
    return (candidate.getFollowerNumber().contains("k")) || ((java.lang.Integer.valueOf(candidate.getRepoNumber())) > (processor.CandidateFilter.EXPECTED_REPO_NUM));
}