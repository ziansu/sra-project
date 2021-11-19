public boolean atRisk(edu.virginia.psyc.pi.persistence.Questionnaire.OA original) {
    return ((score()) / (original.score())) > 1.3;
}