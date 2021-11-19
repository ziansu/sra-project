@java.lang.Override
public voting.model.Candidate addNewCandidate(voting.dto.CandidateData candidateData) {
    voting.model.Candidate candidate = new voting.model.Candidate(candidateData.getPersonId(), candidateData.getFirstName(), candidateData.getLastName());
    return candidateRepository.save(candidate);
}