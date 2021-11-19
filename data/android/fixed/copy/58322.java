public boolean atRisk(edu.virginia.psyc.pi.persistence.Questionnaire.OA original) {
    if ((original.score()) != 0) {
        return ((score()) / (original.score())) > 1.3;
    }else {
        return false;
    }
}