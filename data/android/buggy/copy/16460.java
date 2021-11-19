public void setCandidate(de.neofonie.udacity.capstone.hirefy.modules.candidates.FbCandidate candidate) {
    mCandidate = candidate;
    mRef.removeEventListener(this);
    mRef = mCandidatesManager.getCandidateDetails(mCandidate);
    mRef.addValueEventListener(this);
}