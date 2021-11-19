public void addCandidate(java.lang.String cand) {
    try {
        ballot.add(cand);
        votes.addCandidate(cand);
    } catch (CandidateExistsException e) {
        java.lang.System.out.printf("Candidate %s already exists %n", e.name);
    }
}